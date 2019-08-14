package chilly.java.lessons.demo.methods;

public class MethodsFactorial {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d!=%d\n", i, factorial(i));
		}
	}
	
	public static long factorial(long number) {
		if(number <= 1) {
			return 1;
		} else {
			return factorial(number - 1) * number;
		}
	}

}
