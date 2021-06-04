import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class JConfig {
    // Official client version information, subversion uses 'other_sub_version'
    public static final int VERSION = 124;
    public static final int SUBVERSION = 2;

    public Map<String, String> parameters = new HashMap<>();

    private Map<String, String> m_data = new HashMap<>();

    public boolean fetch(String url) {
        if (Settings.OFFLINE_MODE) {
            parameters.put("20", "https://token-auth.production.jxp.aws.jagex.com/");
            parameters.put("7", "0");
            parameters.put("17", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
            parameters.put("13", ".runescape.com");
            parameters.put("8", "true");
            parameters.put("11", "https://auth.jagex.com");
            parameters.put("3", "true");
            parameters.put("14", "0");
            parameters.put("15", "0");
            parameters.put("1", "1");
            parameters.put("10", "5");
            parameters.put("18", "");
            parameters.put("12", "301"); // World
            parameters.put("9", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            parameters.put("5", "1");
            parameters.put("19", "196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com");
            parameters.put("2", "https://payments.jagex.com/");
            parameters.put("4", "50385");
            parameters.put("16", "false");
            parameters.put("6", "0");
            m_data.put("codebase", "http://127.0.0.1/");
            Settings.EMULATE_CLIENT_UPDATER = true;
            Settings.EMULATE_WORLD_SWITCHER = true;
            return true;
        }

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

    public String getData(String key) {
        if (m_data.containsKey(key))
            return m_data.get(key);
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
