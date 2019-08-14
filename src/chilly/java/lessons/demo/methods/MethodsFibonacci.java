package chilly.java.lessons.demo.methods;

public class MethodsFibonacci {

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			System.out.printf("Fibonacci of %d is: %d\n", i, fibonacci(i));
		}
	}
	
	public static long fibonacci(long number) {
		if((number == 0) || (number == 1)) {
			return number;
		} else {
			return  fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

}
