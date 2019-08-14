package chilly.java.lessons.demo.methods;

public class MethodsFindareasOverriding {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Retangle r = new Retangle(20, 20);
		Figure figref;
		figref = f;
		System.out.println("Area is :" + figref.area(10));
		figref = r;
		System.out.println("Area is :" + figref.area(10));
	}
}

class Figure {
	double dim1;
	double dim2;
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	Double area(int num) {
		System.out.println("Inside area for figure.");
		return dim1 * dim2;
	}
}

class Retangle extends Figure {
	Retangle(double a, double b) {
		super(a, b);
	}
	Double area(int num) {
		System.out.println("Inside area for retangle.");
		return(dim1 * dim2 * num);
	}
}