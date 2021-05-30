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

    public static void main(String[] args) {
        instance = new launcher();
    }

    private void loadParameters() {
        parameters.put("20", "https://token-auth.production.jxp.aws.jagex.com/");
        parameters.put("19", "196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com");
        parameters.put("15", "0");
        parameters.put("11", "https://auth.jagex.com/");
        parameters.put("8", "true");
        parameters.put("4", "58793");
        parameters.put("5", "1");
        parameters.put("12", "490");
        parameters.put("14", "0");
        parameters.put("13", ".runescape.com");
        parameters.put("2", "https://payments.jagex.com/");
        parameters.put("9", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
        parameters.put("18", "");
        parameters.put("1", "1");
        parameters.put("10", "5");
        parameters.put("16", "false");
        parameters.put("6", "0");
        parameters.put("7", "0");
        parameters.put("3", "true");
        parameters.put("17", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
    }

    public launcher() {
        loadParameters();

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
        try {
            return new URL("http://oldschool190.runescape.com/");
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String getParameter(String name) {
        String result = null;
        if (parameters.containsKey(name))
            result = parameters.get(name);
        System.out.println(name + ": " + result);
        return result;
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
        showDocument(url, "");
    }

    @Override
    public void showDocument(URL url, String target) {
        System.out.println("showDocument");
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
