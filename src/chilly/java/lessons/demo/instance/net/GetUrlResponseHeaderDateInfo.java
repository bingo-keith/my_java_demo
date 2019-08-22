package chilly.java.lessons.demo.instance.net;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class GetUrlResponseHeaderDateInfo {
   public static void main(String args[]) throws Exception {
      URL url = new URL("http://www.icrazyman.cn");
      HttpURLConnection httpCon = 
      (HttpURLConnection) url.openConnection();
      long date = httpCon.getDate();
      if (date == 0)
      System.out.println("无法获取信息。");
      else
      System.out.println("Date: " + new Date(date));
   }
}
