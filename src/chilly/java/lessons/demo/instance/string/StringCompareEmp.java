package chilly.java.lessons.demo.instance.string;

/**
 * 字符串比较 通过字符串函数 compareTo (string) ，compareToIgnoreCase(String) 及
 * compareTo(object string) 来比较两个字符串，并返回字符串中第一个字母ASCII的差值。
 * 
 * @author Chilly
 *
 */
public class StringCompareEmp {

	public static void main(String[] args) {
		String str = "Hello world";
		String anotherString = "hello world";
		Object objStr = str;

		System.out.println(str.compareTo(anotherString)); // -32
		System.out.println(str.compareToIgnoreCase(anotherString)); // 0
		System.out.println(str.compareTo(objStr.toString())); // 0
	}

}
