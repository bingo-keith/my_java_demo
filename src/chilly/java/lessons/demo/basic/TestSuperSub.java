package chilly.java.lessons.demo.basic;

class SuperClass {
	  SuperClass(){
	    System.out.println("SuperClass()");
	  }
	  SuperClass(int n) {
	    System.out.println("SuperClass(int n)");
	  }
	}
	// SubClass 类继承
	class SubClass extends SuperClass{
	  SubClass(){ // 自动调用父类的无参数构造器
	    System.out.println("SubClass");
	  }  
	  
	  public SubClass(int n){ 
	    super(300);  // 调用父类中带有参数的构造器
	    System.out.println("SubClass(int n):"+n);
	  }
	}
	// SubClass2 类继承
	class SubClass2 extends SuperClass{
	  SubClass2(){
	    super(300);  // 调用父类中带有参数的构造器
	    System.out.println("SubClass2");
	  }  
	  
	  public SubClass2(int n){ // 自动调用父类的无参数构造器
	    System.out.println("SubClass2(int n):"+n);
	  }
	}
	public class TestSuperSub{
	  public static void main (String args[]){
	    System.out.println("------SubClass 类继承------");
	    new SubClass();
	    new SubClass(100); 
	    System.out.println("------SubClass2 类继承------");
	    new SubClass2();
	    new SubClass2(200); 
	  }
	}