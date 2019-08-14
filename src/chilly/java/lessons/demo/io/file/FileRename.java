package chilly.java.lessons.demo.io.file;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		File oldName = new File("C:/test1.txt");
		File newName = new File("C:/test2.txt");
		if(oldName.renameTo(newName)) {
			System.out.println("已重命名");
		} else {
			System.out.println("Error");
		}
	}

}
