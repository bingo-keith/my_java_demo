package chilly.java.lessons.demo.io.direction;

import java.io.File;
import java.util.Date;

public class DirectoriesGetLastModify {
	public static void main(String[] args) {
		File file = new File("C://FileIO//demo.txt");
		System.out.println("最后修改时间：" + new Date(file.lastModified()));
	}
}
