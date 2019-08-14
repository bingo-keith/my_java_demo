package chilly.java.lessons.demo.io.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileContentCopy {

	public static void main(String[] args) throws Exception {
		BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile.txt"));
		out1.write("string to be copied\n");
		out1.close();
		InputStream in = new FileInputStream(new File("srcfile.txt"));
		OutputStream out = new FileOutputStream(new File("destnfile.txt"));
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader("destnfile.txt"));
		String str;
		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in1.close();
	}

}
