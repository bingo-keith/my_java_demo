package chilly.java.lessons.demo.io.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) throws Exception {
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("filename.txt"));
			out.write("aString\n");
			out.close();
			out = new BufferedWriter(new FileWriter("filename.txt", true));
			out.write("aString2");
			out.close();
			BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("exception occoured" + e);
		}
	}

}
