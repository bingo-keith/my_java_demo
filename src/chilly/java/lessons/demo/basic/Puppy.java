package chilly.java.lessons.demo.basic;

public class Puppy {
	
	int puppyAge;
	
	public Puppy(String name){
		System.out.println("小狗的名字是：" + name);
	}
	
	public void setAge(int age){
		puppyAge = age;
	}
	
	public int getAge(){
		System.out.println("小狗的年龄是：" + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args){
		Puppy p = new Puppy("小白");
		p.setAge(11);
		System.out.println(p.getAge());
	}

}
