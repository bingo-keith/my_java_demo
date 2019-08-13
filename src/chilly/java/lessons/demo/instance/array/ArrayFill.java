package chilly.java.lessons.demo.instance.array;

import java.util.Arrays;

public class ArrayFill {
//	Arrays.fill(arrayName,value) 方法和Arrays.fill(arrayName ,starting index ,ending index ,value) 
	public static void main(String[] args) {
		int array[] = new int[6];
		Arrays.fill(array, 100);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		Arrays.fill(array, 3, 6, 50);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
