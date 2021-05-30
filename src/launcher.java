import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

public class launcher extends JFrame implements AppletStub, AppletContext, WindowListener {
    private static launcher instance;
    private HashMap<String, String> parameters = new HashMap<String, String>();
    private Applet applet;
    JConfig config;

    public static void main(String[] args) {
        instance = new launcher();
    }

    public launcher() {
        applet = new client();
        applet.setStub(this);
        applet.setPreferredSize(new Dimension(800, 600));

        addWindowListener(this);
        setResizable(true);
        setVisible(true);
        setContentPane(applet);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        pack();

        System.setProperty("user.home", ".");

        config = new JConfig();
        if (config.fetch("http://oldschool190.runescape.com/jav_config.ws") && config.isSupported()) {
            applet.init();
            applet.start();
        }
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
}
