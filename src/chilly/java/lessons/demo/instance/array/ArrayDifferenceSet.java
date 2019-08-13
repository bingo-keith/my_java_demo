package chilly.java.lessons.demo.instance.array;

import java.util.ArrayList;

public class ArrayDifferenceSet {

	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon");
		objArray2.add(3, "notcommon1");
		objArray.add(0, "common1");
		objArray.add(1, "common2");
		objArray.add(2, "notcommon2");
		System.out.println("array1的元素" + objArray);
		System.out.println("array2的元素" + objArray2);
		objArray.removeAll(objArray2);
		System.out.println("array1与array2的数组差集为：" + objArray);
	}

}
