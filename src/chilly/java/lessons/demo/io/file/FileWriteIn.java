package chilly.java.lessons.demo.io.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteIn {

	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
			out.write("你好！中国11！！！Hello Chilly!!!");
			out.write("你好！中国22！！！Hello Chilly!!!");
			out.close();
			System.out.println("文件创建成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
