package chilly.java.lessons.demo.instance.string;

/**
 * 删除字符串中的一个字符
 * 
 * @author Chilly
 *
 */
public class RemoveCharAt {

	public static void main(String[] args) {
		String str = "this is Java";
		System.out.println(removeCharAt(str, 3));

	}

	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}

}
