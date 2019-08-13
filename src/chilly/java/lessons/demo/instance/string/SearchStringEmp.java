package chilly.java.lessons.demo.instance.string;

/**
 * 字符串搜索
 * 
 * @author Chilly
 *
 */
public class SearchStringEmp {

	public static void main(String[] args) {
		String strOrig = "Hello Chilly Ice! Nice to meet you!";
		int idx = strOrig.indexOf("Chilly");
		if (idx == -1) {
			System.out.println("没有找到字符串Chilly");
		} else {
			System.out.println("Chilly位置是" + idx);
		}
	}

}
