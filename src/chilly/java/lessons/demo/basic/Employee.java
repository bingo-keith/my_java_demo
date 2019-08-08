package chilly.java.lessons.demo.basic;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	public Employee(String name){
		this.name = name;
	}
	
	public void empAge(int empAge){
		this.age = empAge;
	}
	
	public void empDesignation(String empDesign){
		this.designation = empDesign;
	}
	
	public void empSalary(double empSalary){
		salary = empSalary;
	}
	
	public void printEmployee(){
		System.out.println("名字：" + this.name);
		System.out.println("年龄：" + this.age);
		System.out.println("职位：" + this.designation);
		System.out.println("薪水：" + this.salary);
	}
}
