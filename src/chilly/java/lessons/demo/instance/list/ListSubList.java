package chilly.java.lessons.demo.instance.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSubList {
   public static void main(String[] args) {
      List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println("List :"+list);
      List<String> sublist = Arrays.asList("three Four".split(" "));
      System.out.println("子列表 :"+sublist);
      System.out.println("indexOfSubList: " + Collections.indexOfSubList(list, sublist));
      System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
   }
}
