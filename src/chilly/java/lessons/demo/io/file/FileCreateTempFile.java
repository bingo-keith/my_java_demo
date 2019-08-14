package chilly.java.lessons.demo.io.file;

import java.io.File;
import java.io.IOException;

public class FileCreateTempFile {

	public static void main(String[] args) {
		File f = null;
		try {
			/**
			 * createTempFile(String prefix前缀, String suffix后缀, File directory目录)
			 */
			// 创建临时文件
			f = File.createTempFile("tmp", ".txt", new File("C:/"));
			// 输出绝对路径
			System.out.println("File Path: " + f.getAbsolutePath());
			// 终止后删除临时文件
			f.deleteOnExit();
			
			f = File.createTempFile("tmp", null, new File("D:/"));
			System.out.println("File Path: " + f.getAbsolutePath());
			f.deleteOnExit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
