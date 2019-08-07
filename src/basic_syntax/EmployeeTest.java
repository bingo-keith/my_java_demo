package basic_syntax;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee empOne = new Employee("name1");
		Employee empTwo = new Employee("name2");	
		
		empOne.empAge(22);
		empOne.empDesignation("test1");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(11);
		empTwo.empDesignation("test2");
		empTwo.empSalary(2000);
		empTwo.printEmployee();
	}

}
