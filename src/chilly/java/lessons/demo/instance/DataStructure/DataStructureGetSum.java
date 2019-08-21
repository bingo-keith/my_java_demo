package chilly.java.lessons.demo.instance.DataStructure;

public class DataStructureGetSum {

	public static void main(String[] args) {
		int limit = 100;
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i ++;
		} while (i <= limit);
		System.out.println("sum = " + sum);
		System.out.println(getSum(100));
		System.out.println(getName("test11"));
	}
	
	public static int getSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static String getName(String code) {
		String str = "";
		switch(code) {
			case "test1":
				str = code + "测试1";
				break;
			case "test2":
				str = code + "测试2";
				break;
			default:
				str = code + "测试3";
				break;
		}
		return str;
	}

}
