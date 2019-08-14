package chilly.java.lessons.demo.io.file;

import java.io.File;
import java.util.Date;

public class FileGetModifyDate {

	public static void main(String[] args) {
		File file = new File("C:/test.txt");
		Long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		System.out.println(date);
	}

}
