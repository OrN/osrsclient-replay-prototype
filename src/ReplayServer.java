import java.io.*;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ReplayServer implements Runnable {
    ServerSocketChannel sock;
    SocketChannel client;
    DataInputStream inputIn;
    long replayStartTime;

    private final int DEFAULT_PORT = 43594;

    private static ReplayServer instance;
    private static Thread thread;

    public static String replayPath;

    public static void Start() {
        instance = new ReplayServer();
        thread = new Thread(instance);

        thread.start();
    }

    public static void Stop() {
    }

    public void run() {
        try {
            boolean update = replayPath.endsWith("update.bin");

            sock = ServerSocketChannel.open();
            sock.bind(new InetSocketAddress(DEFAULT_PORT));

            client = sock.accept();

            if (update)
                inputIn = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(ReplayServer.replayPath))));
            else
                inputIn = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(ReplayServer.replayPath + "/input.bin"))));

            // Wait for client response before starting
            ByteBuffer readData = ByteBuffer.allocate(1000);
            client.read(readData);

            replayStartTime = System.currentTimeMillis();
            long currentTimestamp = 0;
            long nextTimestamp = inputIn.readLong();

            for (;;) {
                currentTimestamp = System.currentTimeMillis() - replayStartTime;

                if (update)
                    currentTimestamp = nextTimestamp;

                while (currentTimestamp >= nextTimestamp) {
                    int len = inputIn.readInt();
                    byte[] data = new byte[len];
                    inputIn.read(data, 0, len);

                    ByteBuffer buffer = ByteBuffer.allocate(len);
                    buffer.put(data);
                    buffer.flip();
                    int writeLength = client.write(buffer);

                    nextTimestamp = inputIn.readLong();
                }

                Thread.sleep(1);
            }
        } catch (Exception e) {
        }

        try {
            inputIn.close();
            sock.close();
            client.close();
        } catch (Exception e) {}
    }

    public static String getHost(String host) {
        String ret = "127.0.0.1";

        if (!Replay.clientReady && Settings.DISABLE_CLIENT_UPDATER) {
            ReplayServer.replayPath = "./assets/update.bin";
            ReplayServer.Start();
            System.out.println(ret);
            return ret;
        }

        if (!Settings.ENABLE_REPLAY_SUPPORT || !Replay.isPlayback())
            ret = host;
        System.out.println(ret);
        return ret;
    }
}
