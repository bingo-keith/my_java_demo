package chilly.java.lessons.demo.instance.list;

import java.util.Enumeration;
import java.util.Hashtable;

public class ListHashTableValue {
   public static void main(String[] args) {
      Hashtable<String, String> ht = new Hashtable<String, String>();
      ht.put("1", "One");
      ht.put("2", "Two");
      ht.put("3", "Three");
      Enumeration<String> e = ht.keys();
      while (e.hasMoreElements()){
         System.out.println(e.nextElement());
      }
      
      Enumeration<String> e1 = ht.elements();
      while(e1.hasMoreElements()){
         System.out.println(e1.nextElement());
      }
   }
}
