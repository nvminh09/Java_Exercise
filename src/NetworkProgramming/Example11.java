package NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Example11 {
    public static void main(String[] args) {
        try {
            String url = "https://en.wikipedia.org/wiki/Vietnam";
            URL urlRead = new URL(url);
            InputStreamReader reader = new InputStreamReader(urlRead.openStream());
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
