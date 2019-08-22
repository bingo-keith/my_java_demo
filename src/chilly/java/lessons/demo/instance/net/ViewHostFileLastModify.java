package chilly.java.lessons.demo.instance.net;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ViewHostFileLastModify {
    public static void main(String[] argv) throws Exception {
        URL u = new URL("http://127.0.0.1/test/test.html");
        URLConnection uc = u.openConnection();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("test.html 文件最后修改时间 :" + ft.format(new Date(timestamp)));
    }
}
