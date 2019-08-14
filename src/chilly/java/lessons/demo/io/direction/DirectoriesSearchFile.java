package chilly.java.lessons.demo.io.direction;

import java.io.File;

public class DirectoriesSearchFile {
	public static void main(String[] args) {
		File dir = new File("../my_java_demo");
		String[] children = dir.list();
		if(children == null) {
			System.out.println("该目录不存在");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
