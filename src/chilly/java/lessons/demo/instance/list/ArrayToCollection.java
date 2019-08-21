package chilly.java.lessons.demo.instance.list;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		int n = 5;
		String[] name = new String[n];
		for (int i = 0; i < n; i++) {
			name[i] = String.valueOf(i);
		}
		List<String> list = Arrays.asList(name);
		System.out.println();
		for(String li: list) {
			System.out.println(li);
		}
	}

}
