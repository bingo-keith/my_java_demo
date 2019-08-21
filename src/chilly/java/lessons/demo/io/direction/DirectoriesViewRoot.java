package chilly.java.lessons.demo.io.direction;

import java.io.File;

public class DirectoriesViewRoot {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i].toString());
		}
	}
}
