package chilly.java.lessons.demo.instance.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHostIP {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.icrazyman.cn");
        }
        catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.exit(0);
    }
}
