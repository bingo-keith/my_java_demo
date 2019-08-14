package chilly.java.lessons.demo.methods;

enum Car2 {
	lanborighini(900), tata(50), audi(50), fiat(15), honda(12);
	private int price;
	Car2(int p) {
		setPrice(p);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class MethodsEnumConstructor {

	public static void main(String[] args) {
		System.out.println("所有汽车🚕的价格");
		for (int i = 0; i < Car2.values().length; i++) {
			System.out.println(Car2.values()[i] + " 需要 " + Car2.values()[i].getPrice() + " 千美元。 ");
		}
		// 或者
		for (Car2 c: Car2.values()) {
			System.out.println(c + " 需要 " + c.getPrice() + "千美元。");
		}
	}

}
