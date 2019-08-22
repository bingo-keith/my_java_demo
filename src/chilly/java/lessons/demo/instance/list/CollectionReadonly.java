package chilly.java.lessons.demo.instance.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionReadonly {
	   public static void main(String[] argv) throws Exception {
	      List<String> stuff = Arrays.asList(new String[] { "a", "b" });
	      List<String> list = new ArrayList<String>(stuff);
	      list = Collections.unmodifiableList(list);
	      try {
	         list.set(0, "new value");
	      } 
	        catch (UnsupportedOperationException e) {
	      }
	      Set<String> set = new HashSet<String>(stuff);
	      set = Collections.unmodifiableSet(set);
	      Map<?, ?> map = new HashMap<Object, Object>();
	      map = Collections.unmodifiableMap(map);
	      System.out.println("集合现在是只读");
	   }
}
