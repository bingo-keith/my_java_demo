package chilly.java.lessons.demo.instance.array;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("数组 ary 是否与数组 ary1相等? ：" + Arrays.equals(ary, ary1));
        System.out.println("数组 ary 是否与数组 ary2相等? ：" + Arrays.equals(ary, ary2));
	}

}
