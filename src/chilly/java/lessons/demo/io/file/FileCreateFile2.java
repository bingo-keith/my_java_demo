package chilly.java.lessons.demo.io.file;

import java.io.File;
import java.io.IOException;

public class FileCreateFile2 {

	public static void main(String[] args) {
		try {
			File file = new File("C:/test.txt");
			if(file.createNewFile())
				System.out.println("文件创建成功");
			else
				System.out.println("出错了，该文件已经存在");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
