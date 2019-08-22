package chilly.java.lessons.demo.instance.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionListAll {
   public static void main(String[] args) {
      // List集合的遍历
      listTest();
      // Set集合的遍历
      setTest();
   }
	 
   private static void setTest() {
      Set<String> set = new HashSet<String>();
      set.add("java");
      set.add("php");
      set.add("nodejs");
      // 重复数据添加失败
      set.add("java");
      set.add("javascript");
 
      // 使用iterator遍历set集合
      Iterator<String> it = set.iterator();
      while (it.hasNext()) {
         String value = it.next();
         System.out.println(value);
      }
      
      // 使用增强for循环遍历set集合
      for(String s: set){
         System.out.println(s);
      }
   }
 
   // 遍历list集合
   private static void listTest() {
      List<String> list = new ArrayList<String>();
      list.add("科");
      list.add("瑞");
      list.add("兹");
      list.add("曼");
      list.add("www.icrazyman.cn");
 
      // 使用iterator遍历
      Iterator<String> it = list.iterator();
      while (it.hasNext()) {
         String value = it.next();
         System.out.println(value);
      }
 
      // 使用传统for循环进行遍历
      for (int i = 0, size = list.size(); i < size; i++) {
         String value = list.get(i);
         System.out.println(value);
      }
 
      // 使用增强for循环进行遍历
      for (String value : list) {
         System.out.println(value);
      }
   }
}
