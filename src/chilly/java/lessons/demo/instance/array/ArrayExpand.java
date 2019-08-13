package chilly.java.lessons.demo.instance.array;

public class ArrayExpand {

	public static void main(String[] args) {
		// arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		String[] names = new String[] { "A", "B", "C" };
		String[] extended = new String[6];
		extended[3] = "D";
		extended[4] = "E";
		System.arraycopy(names, 0, extended, 0, names.length);
		for (String str: extended) {
			System.out.println(str);
		}
	}

}
