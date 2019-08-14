package chilly.java.lessons.demo.graphic;

public class Triangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; i <= j; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			for (int j = 1; j < i; j++)
				System.out.print("*");
			System.out.println();
		}

		// 打印倒立的三角形
		for (int m = 1; m <= 5; m++) {
			// 打印空格
			for (int n = 0; n <= m; n++) {
				System.out.print(" ");
			}
			// 打印*
			for (int x = 1; x <= 7 - 2 * (m - 1); x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
