package chilly.java.lessons.demo.instance.string;

/**
 * 查找字符串最后一次出现的位置
 * 
 * @author Chilly
 *
 */
public class SearchlastString {

	public static void main(String[] args) {
		String strOrig = "Hello world, Hello Chilly";
		int lastIndex = strOrig.lastIndexOf("Chilly");
		if (lastIndex == -1) {
			System.out.println("没有找到字符串Chilly");
		} else {
			System.out.println("Chilly字符串最后出现的位置：" + lastIndex);
		}

	}

}
