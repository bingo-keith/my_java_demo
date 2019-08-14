package chilly.java.lessons.demo.io.file;

import java.io.File;

public class FileCreateFile {

	public static void main(String[] args) throws Exception {
		File file = null;
		File dir = new File("C:/");
		file = File.createTempFile("java", ".temp", dir);
		System.out.println(file.getPath());
	}

}
