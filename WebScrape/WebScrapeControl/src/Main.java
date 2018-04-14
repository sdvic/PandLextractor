import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main
{
    URL url;
    URL myUrl = null;
    InputStream is = null;
    BufferedReader br = null;
    String line;
    String inputLine;
    HttpsURLConnection conn = null;
    InputStreamReader isr;

    public static void main(String[] args) throws IOException
    {
        Main main = new Main();
        main.getGloing();
    }

    private void getGloing() throws IOException
    {
        System.out.println("starting");
        String httpsURL = "https://core.score.org/";
        try
        {
            myUrl = new URL(httpsURL);
            conn = (HttpsURLConnection) myUrl.openConnection();
            is = conn.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }

        while ((inputLine = br.readLine()) != null)
        {
            System.out.println(inputLine);
        }

        try
        {
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

//        try {
//
//            URL url = new URL("www.sandiego.score.org");
//            br = new BufferedReader(new InputStreamReader(url.openStream()));
//
//            String line;
//
//            StringBuilder sb = new StringBuilder();
//
//            while ((line = br.readLine()) != null) {
//
//                sb.append(line);
//                sb.append(System.lineSeparator());
//            }
//
//            System.out.println(sb);
//        }
//        catch (MalformedURLException e)
//        {
//            e.printStackTrace();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        finally {
//
//            if (br != null) {
//                try
//                {
//                    br.close();
//                }
//                catch (IOException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//        }


