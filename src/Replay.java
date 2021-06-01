import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Replay {
    public enum Mode {
        RECORD,
        PLAYBACK,
    }

    private static Mode mode = Mode.RECORD;
    private static boolean active = false;
    private static int prevSizeMode;

    private static String replayDirectory;
    private static long replayStartTime;
    private static DataOutputStream keysOut;
    private static DataOutputStream inputOut;
    private static DataOutputStream outputOut;
    private static DataOutputStream settingsOut;

    private static DataInputStream keysIn;
    private static DataInputStream settingsIn;

    public static boolean clientReady = false;

    public static boolean isPlayback() {
        return (mode == Mode.PLAYBACK && clientReady);
    }

    public static int[] getKeysRecord(int[] keys) {
        try {
            for (int i = 0; i < keys.length; i++)
                keysOut.writeInt(keys[i]);
            keysOut.flush();
        } catch (Exception e) {}

        return keys;
    }

    public static int[] getKeysPlayback(int[] keys) {
        try {
            int newKeys[] = new int[keys.length];
            for (int i = 0; i < keys.length; i++)
                newKeys[i] = keysIn.readInt();
            return newKeys;
        } catch (Exception e) {}

        return keys;
    }

    public static void start() {
        try {
            if (!active) {
                switch (mode) {
                    case PLAYBACK:
                        ReplayServer.replayPath = "./replays/05-31-2021 05.26.58";
                        keysIn = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(ReplayServer.replayPath + "/keys.bin"))));
                        settingsIn = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(ReplayServer.replayPath + "/settings.bin"))));

                        prevSizeMode = class_87.preferences.clientSizeMode;
                        class_87.preferences.clientSizeMode = settingsIn.readInt();
                        class_240.method_4645(class_87.preferences.clientSizeMode * -660685365, 847550164);

                        ReplayServer.Start();
                        break;
                    case RECORD:
                        String timeStamp = new SimpleDateFormat("MM-dd-yyyy HH.mm.ss").format(new Date());
                        replayDirectory = "./replays/" + timeStamp + "/";
                        File fReplayDirectory = new File(replayDirectory);
                        fReplayDirectory.mkdirs();
                        keysOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(replayDirectory + "/keys.bin"))));
                        inputOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(replayDirectory + "/input.bin"))));
                        outputOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(replayDirectory + "/output.bin"))));
                        settingsOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(replayDirectory + "/settings.bin"))));

                        settingsOut.writeInt(class_87.preferences.clientSizeMode);
                        settingsOut.flush();

                        // Initialize data
                        replayStartTime = System.currentTimeMillis();
                        break;
                }
            }
        } catch (Exception e) {}

        active = true;
    }

    public static void stop() {
        if (!active)
            return;

        try {
            if (mode == Mode.RECORD) {
                keysOut.flush();
                keysOut.close();
                inputOut.flush();
                inputOut.close();
                outputOut.flush();
                outputOut.close();
                settingsOut.flush();
                settingsOut.close();
            } else if (mode == Mode.PLAYBACK) {
                keysIn.close();
                settingsIn.close();

                class_87.preferences.clientSizeMode = prevSizeMode;
                class_240.method_4645(class_87.preferences.clientSizeMode * -660685365, 847550164);
                class_94.savePreferences(-2074912368);
            }
        } catch (Exception e) {}

        active = false;
    }

    public static void saveInput(byte[] src, int offset, int len) {
        if (!active || mode == Mode.PLAYBACK)
            return;

        try {
            long timestamp = System.currentTimeMillis() - replayStartTime;
            inputOut.writeLong(timestamp);
            inputOut.writeInt(len);
            inputOut.write(src, offset, len);
            inputOut.flush();
        } catch (Exception e) {}
    }

    public static void saveOutput(byte[] src, int offset, int len) {
        if (!active || mode == Mode.PLAYBACK)
            return;

        System.out.println("Writing " + len + " bytes");

        try {
            long timestamp = System.currentTimeMillis() - replayStartTime;
            outputOut.writeLong(timestamp);
            outputOut.writeInt(len);
            outputOut.write(src, offset, len);
            outputOut.flush();
        } catch (Exception e) {}
    }

    public static int[] loadKeys(int[] keys) {
        switch(mode) {
            case PLAYBACK: {
                return getKeysPlayback(keys);
            }
            case RECORD: {
                return getKeysRecord(keys);
            }
        }

        return keys;
    }
}
