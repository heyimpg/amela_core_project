package java_web.branches_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            // Code here
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            //Show Data
            //C1
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");

            String content = scanner.next();
            content = content.replaceAll("\\n+", "");

            // regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                //System.out.println(content.substring(m.start(), m.end()));
                System.out.println(m.group(1));
            }

            scanner.close();

            //C2
           /* InputStreamReader inputStreamReader =  new InputStreamReader(url.openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            String str;
            while ( (str= bufferedReader.readLine()) != null )
            {
                Matcher m = p.matcher(str);
                if(m.find())
                    System.out.println(m.group(1));
            }*/




        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n--------End Code--------");
    }
}
