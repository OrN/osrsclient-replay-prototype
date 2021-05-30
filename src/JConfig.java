import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class JConfig {
    // Official client version information, subversion uses 'other_sub_version'
    public static final int VERSION = 124;
    public static final int SUBVERSION = 2;

    public Map<String, String> parameters = new HashMap<>();

    private Map<String, String> m_data = new HashMap<>();

    public boolean fetch(String url) {
        try {
            URL configURL = new URL(url);

            // Open connection
            URLConnection connection = configURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                // Skip empty lines
                if (line.length() <= 0) continue;

                String key = line.substring(0, line.indexOf('='));

                // Skip official client locale messages
                if ("msg".equals(key)) continue;

                String value = line.substring(key.length() + 1);

                switch (key) {
                    case "param":
                        String paramKey = value.substring(0, value.indexOf('='));
                        String paramValue = value.substring(paramKey.length() + 1);
                        parameters.put(paramKey, paramValue);
                        break;
                    default:
                        m_data.put(key, value);
                        break;
                }
            }

            // Close connection
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isSupported() {
        String version = m_data.get("viewerversion");
        if (version == null) version = "124";

        String subVersion = m_data.get("other_sub_version");
        if (subVersion == null) subVersion = "2";

        return Integer.valueOf(version) <= VERSION && Integer.valueOf(subVersion) <= SUBVERSION;
    }

    public String getParameter(String key) {
        if (parameters.containsKey(key))
            return parameters.get(key);
        else
            return null;
    }

    public URL getURL(String key) {
        try {
            return new URL(m_data.get(key));
        } catch (Exception e) {
            return null;
        }
    }

}
