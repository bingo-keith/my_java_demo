package chilly.java.lessons.demo.instance.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionIterator {
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("1", "1st");
		hMap.put("2", "2st");
		hMap.put("3", "3st");
		Collection cl = hMap.values();
		Iterator itr = cl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
