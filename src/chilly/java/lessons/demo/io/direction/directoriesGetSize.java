package chilly.java.lessons.demo.io.direction;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class directoriesGetSize {
	public static void main(String[] args) {
		long size = FileUtils.sizeOfDirectory(new File("src"));
		System.out.println("size: " + size + " bytes");
	}
}
