package chilly.java.lessons.demo.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadContent {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader("test.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
