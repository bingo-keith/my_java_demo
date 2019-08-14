package chilly.java.lessons.demo.io.direction;

import java.io.File;

public class DirectoriesMkDir {
	public static void main(String[] args) {
		String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
		File file = new File(directories);
		boolean result = file.mkdirs();
		System.out.println("status = " + result);
	}
}
