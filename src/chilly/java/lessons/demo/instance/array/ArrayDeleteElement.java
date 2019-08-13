package chilly.java.lessons.demo.instance.array;

import java.util.ArrayList;

public class ArrayDeleteElement {

	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0, "第0个元素");
		objArray.add(1, "第1个元素");
		objArray.add(2, "第2个元素");
		System.out.println("数组删除元素前：" + objArray);
		objArray.remove(1);
		System.out.println("数组删除一个元素：" + objArray);
		objArray.remove("第2个元素");
		System.out.println("数组删除元素后：" + objArray);
	}

}
