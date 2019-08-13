package chilly.java.lessons.demo.instance.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
	}

}
