package chilly.java.lessons.demo.io.file;

import java.io.File;

public class FileCheckExist {

	public static void main(String[] args) {
		File file = new File("C:/java.txt");
		System.out.println(file.exists());
	}

}
