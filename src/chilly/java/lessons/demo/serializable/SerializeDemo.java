package chilly.java.lessons.demo.serializable;
import java.io.*;

public class SerializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 111222333;
      e.number = 101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("/java/my_java_demo/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /java/my_java_demo/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}