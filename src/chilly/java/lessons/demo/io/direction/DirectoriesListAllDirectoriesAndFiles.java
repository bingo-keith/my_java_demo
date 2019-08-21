package chilly.java.lessons.demo.io.direction;

import java.io.File;
import java.io.FileFilter;

public class DirectoriesListAllDirectoriesAndFiles {

	public static void main(String[] args) {
		File dir = new File("E:\\");
//		遍历指定目录下的所有目录
		File[] files = dir.listFiles();
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		files = dir.listFiles(fileFilter);
		System.out.println(files.length);
		if (files.length == 0) {
			System.out.println("目录不存在或它不是一个目录");
		} else {
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				System.out.println(filename.toString());
			}
		}
		System.out.println();
		
//		输出指定目录下的所有文件
		String[] children = dir.list();
		if(children == null) {
			System.out.println("目录不存在或它不是一个目录");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}

}
