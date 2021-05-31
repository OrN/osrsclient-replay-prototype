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
            sock = ServerSocketChannel.open();
            sock.bind(new InetSocketAddress(DEFAULT_PORT));

            client = sock.accept();

            inputIn = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(ReplayServer.replayPath + "/input.bin"))));

            // Wait for client response before starting
            ByteBuffer readData = ByteBuffer.allocate(1000);
            client.read(readData);

            replayStartTime = System.currentTimeMillis();
            long currentTimestamp = 0;
            long nextTimestamp = inputIn.readLong();

            for (;;) {
                currentTimestamp = System.currentTimeMillis() - replayStartTime;

                //System.out.println("current: " + currentTimestamp + ", next: " + nextTimestamp);

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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            inputIn.close();
            sock.close();
            client.close();
        } catch (Exception e) {}
    }

    public static String getHost(String host) {
        if (Replay.isPlayback())
            return "127.0.0.1";
        return host;
    }
}
