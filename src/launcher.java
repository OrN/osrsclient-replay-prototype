import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class launcher extends JFrame implements AppletStub, AppletContext, WindowListener, DropTargetListener {
    private static launcher instance;
    private Applet applet;
    JConfig config;

    // Settings
    public static int world = 1;

    public static void main(String[] args) {
        if (args.length > 0)
            world = Integer.valueOf(args[0]);

        instance = new launcher();
    }

    public launcher() {
        applet = new client();
        applet.setStub(this);
        applet.setPreferredSize(new Dimension(800, 600));

        config = new JConfig();
        if (!config.fetch("http://oldschool" + world + ".runescape.com/jav_config.ws") || !config.isSupported()) {
            return;
        }

        addWindowListener(this);
        setTitle(config.getData("title"));
        setResizable(true);
        setContentPane(applet);
        getContentPane().setBackground(Color.BLACK);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        if (Settings.ENABLE_REPLAY_SUPPORT)
            new DropTarget(this, DnDConstants.ACTION_COPY_OR_MOVE, this);

        System.setProperty("user.home", ".");

        applet.init();
        applet.start();
    }

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public URL getDocumentBase() {
        return getCodeBase();
    }

    @Override
    public URL getCodeBase() {
        if (Settings.CUSTOM_HOST_IP.length() > 0) {
            try {
                return new URL("http://" + Settings.CUSTOM_HOST_IP + "/");
            } catch (Exception e) {
                return null;
            }
        }
        return config.getURL("codebase");
    }

    @Override
    public String getParameter(String name) {
        return config.getParameter(name);
    }

    @Override
    public AppletContext getAppletContext() {
        return instance;
    }

    @Override
    public void appletResize(int width, int height) {
    }

    @Override
    public AudioClip getAudioClip(URL url) {
        return null;
    }

    @Override
    public Image getImage(URL url) {
        return null;
    }

    @Override
    public Applet getApplet(String name) {
        return null;
    }

    @Override
    public Enumeration<Applet> getApplets() {
        return null;
    }

    @Override
    public void showDocument(URL url) {
    }

    @Override
    public void showDocument(URL url, String target) {
    }

    @Override
    public void showStatus(String status) {

    }

    @Override
    public void setStream(String key, InputStream stream) throws IOException {

    }

    @Override
    public InputStream getStream(String key) {
        return null;
    }

    @Override
    public Iterator<String> getStreamKeys() {
        return null;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        setVisible(false);
        applet.stop();
        applet.destroy();
        if (Settings.ENABLE_REPLAY_SUPPORT) {
            Replay.stop();
            ReplayServer.Stop();
        }
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void dragEnter(DropTargetDragEvent dtde) {

    }

    @Override
    public void dragOver(DropTargetDragEvent dtde) {

    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dtde) {

    }

    @Override
    public void dragExit(DropTargetEvent dte) {

    }

    @Override
    public void drop(DropTargetDropEvent evt) {
        if (evt.getTransferable().isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
            evt.acceptDrop(DnDConstants.ACTION_LINK);
            try {
                List<File> droppedFiles = (List<File>)evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);

                for (File f : droppedFiles) {
                    Replay.Play(f.getAbsolutePath());
                    return;
                }
            } catch (Exception e) {}
        }
    }
}
