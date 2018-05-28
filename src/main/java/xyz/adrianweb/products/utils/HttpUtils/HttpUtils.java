package xyz.adrianweb.products.utils.HttpUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

  static {
    System.setProperty("http.agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36");
  }

  public static HttpURLConnection get(String link) throws IOException {
    URL url = new URL(link);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    con.setRequestProperty("Accept", "application/xml");
    return con;
  }
}
