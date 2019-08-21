package chilly.java.lessons.demo.instance.exception;

class Demo {
	//在功能上通过throws的关键字声明该功能可能出现问题
	int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int []arr = new int [a];
		System.out.println(arr[4]);
		return a / b; // 制造的第二处异常
	}
}

public class ExceptionMultiple {

	public static void main(String[] args) {
        Demo d = new Demo();  
        try {  
//                int x = d.div(4,0); // 索引4不存在，最大arr[3]
//                int x = d.div(5,0); // 索引4存在，最大arr[4]
                int x = d.div(5,1); // 没有异常
                System.out.println("x="+x); // 打印结果0 
        }  
        catch (ArithmeticException e) {  
            System.out.println(e.toString());  
        }  
        catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println(e.toString());  
        }  
        catch (Exception e) {  
            // 父类 写在此处是为了捕捉其他没预料到的异常 只能写在子类异常的代码后面  不过一般情况下是不写的   
            System.out.println(e.toString());  
        }  
        System.out.println("Over");  
	}

}
