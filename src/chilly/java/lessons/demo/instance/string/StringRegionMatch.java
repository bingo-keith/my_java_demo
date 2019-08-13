package chilly.java.lessons.demo.instance.string;

/**
 * 测试两个字符串区域是否相等
 * @author Chilly
 *
 */
public class StringRegionMatch {
	public static void main(String[] args) {
		String first_str = "Welcome to my World Welcome to my World";
		String second_str = "i welcome to my world welcome to my world";
//		String first_str = "Welcome to Microsoft";
//		String second_str = "I work with microsoft";
//		first_str.regionMatches(11, second_str, 12, 9) 表示将 first_str 字符串从第11个字符"M"开始和 second_str 字符串的第12个字符"M"开始逐个比较，共比较 9 对字符
		boolean match1 = first_str.regionMatches(11, second_str, 13, 9); // my World 
		boolean match2 = first_str.regionMatches(true, 11, second_str, 13, 9);// my world 
		System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
	}

}
