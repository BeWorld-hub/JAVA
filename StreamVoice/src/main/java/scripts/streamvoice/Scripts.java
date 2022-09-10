package scripts.streamvoice;

import java.net.HttpURLConnection;
import java.net.URL;

public class Scripts {
    public boolean isConnection() {
        boolean result = false;
        HttpURLConnection currentConnection = null;

        try {
            currentConnection = (HttpURLConnection) new URL("https://google.com").openConnection();
            currentConnection.setRequestMethod("HEAD");

            result = (currentConnection.getResponseCode() == HttpURLConnection.HTTP_OK);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (currentConnection != null) {
                try {
                    currentConnection.disconnect();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }

        return result;
    }
}
