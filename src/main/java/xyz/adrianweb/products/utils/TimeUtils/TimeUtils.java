package xyz.adrianweb.products.utils.TimeUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

  public static String getTimestamp() {
    String pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());
    String timestamp = "";
    try {
      timestamp = URLEncoder.encode(date, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return timestamp;
  }
}
