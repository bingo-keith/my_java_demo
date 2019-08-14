package chilly.java.lessons.demo.io.direction;

import java.io.File;

public class DirectoriesWhetherHidden {
	public static void main(String[] args) {
		File file = new File("C:/demo.txt");
		System.out.println(file.isHidden());
	}
}
