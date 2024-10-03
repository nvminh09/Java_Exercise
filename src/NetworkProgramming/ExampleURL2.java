package NetworkProgramming;

import java.net.HttpURLConnection;
import java.net.URL;

public class ExampleURL2 {
    public static void main(String[] args) {
        String[] url = {
                "https://en.wikipedia.org/wiki/Vietnam",
                "https://www.google.com",
                "https://www.facebook123.com"
        };

        try {
            for (int i = 0; i < url.length; i++) {
                URL urlRead = new URL(url[i]);
                HttpURLConnection connection = (HttpURLConnection) urlRead.openConnection();
                int responseCode = connection.getResponseCode();
                /*if (responseCode == HttpURLConnection.HTTP_OK) {
                    System.out.println("URL: " + url[i] + " is OK");
                } else {
                    System.out.println("URL: " + url[i] + " is NOT OK");
                }*/
                if (responseCode == 200) {
                    System.out.println("URL: " + url[i] + " is OK");
                } else {
                    System.out.println("URL: " + url[i] + " is NOT OK. Response code: " + responseCode);
                }
            }
        } catch (Exception e) {
            System.out.println("Cannot connect to the URL.");
        }
    }
}
