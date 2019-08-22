package chilly.java.lessons.demo.instance.list;

import java.util.ArrayList;
import java.util.List;

public class CollectionConvertArrayList {
   public static void main(String[] args){
      List<String> list = new ArrayList<String>();
      list.add("科"); 
      list.add("瑞"); 
      list.add("兹");
      list.add("曼");
      list.add("www.icrazyman.cn");
      String[] s1 = list.toArray(new String[0]); 
      for(int i = 0; i < s1.length; ++i){
         String contents = s1[i];
         System.out.print(contents);
     } 
   }
}
