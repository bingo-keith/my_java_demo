package chilly.java.lessons.demo.socket;
import java.net.*;
import java.io.*;
// javac -d . GreetingClient.java 
// java 目录/GreetingClient localhost 6066
public class GreetingClient {
   public static void main(String [] args) {
      String serverName = args[0];
      int port = Integer.parseInt(args[1]);
      try {
         System.out.println("connect host: " + serverName + " , port:" + port);
         Socket client = new Socket(serverName, port);
         System.out.println("remote host adress: " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         out.writeUTF("Hello from " + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         System.out.println("server response:  " + in.readUTF());
         client.close();
      } catch(IOException e) {
         e.printStackTrace();
      }
   }
}