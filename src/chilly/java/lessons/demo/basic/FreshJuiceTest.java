package chilly.java.lessons.demo.basic;

class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}

public class FreshJuiceTest {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.LARGE;
		System.out.println(juice.size);
	}

}