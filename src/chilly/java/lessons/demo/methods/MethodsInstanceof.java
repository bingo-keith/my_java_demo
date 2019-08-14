package chilly.java.lessons.demo.methods;

import java.util.ArrayList;
import java.util.Vector;

public class MethodsInstanceof {

	public static void main(String[] args) {
		Object testObject = new ArrayList<Object>();
		displayObjectClass(testObject);
	}
	
	public static void displayObjectClass(Object o) {
		if(o instanceof Vector)
			System.out.println("对象是java.util.Vector类的实例");
		else if(o instanceof ArrayList)
			System.out.println("对象是java.util.ArrayList类的实例");
		else
			System.out.println("对象是" + o.getClass() + "类的实例");
	}
}
