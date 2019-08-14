package chilly.java.lessons.demo.io.direction;

import java.io.File;

public class DirectoriesDeleteDir {

	public static void main(String[] args) throws Exception {
		String directories = "D:\\a";
		deleteDir(new File(directories));
	}
	
	public static boolean deleteDir(File dir) {
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if(!success) {
					return false;
				}
			}
		}
		if(dir.delete()) {
			System.out.println("目录已删除");
			return true;
		} else {
			System.out.println("目录删除失败");
			return false;
		}
	}

}
