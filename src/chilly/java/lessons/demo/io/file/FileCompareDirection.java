package chilly.java.lessons.demo.io.file;

import java.io.File;

public class FileCompareDirection {

	public static void main(String[] args) {
		File file1 = new File("C:/demo1/test.txt");
		File file2 = new File("C:/demo2/test.txt");
		if(file1.compareTo(file2) == 0) {
			System.out.println("文件路径一致！");
		} else {
			System.out.println("文件路径不一致！");
		}
	}

}
