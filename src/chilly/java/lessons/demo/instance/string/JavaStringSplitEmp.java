package chilly.java.lessons.demo.instance.string;

import java.util.StringTokenizer;

/**
 * 字符串分隔
 * 
 * @author Chilly
 *
 */
public class JavaStringSplitEmp {

	public static void main(String[] args) {
		String str = "This is String, split by StringTokenizer, created by Chilly";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("----------通过空格分隔----------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		System.out.println("----------通过逗号分隔----------");
		StringTokenizer st2 = new StringTokenizer(str, ",");
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}

	}

}
