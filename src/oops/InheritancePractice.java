package oops;

public class InheritancePractice {

	public static void main(String[] args) {
		Employee emp = new Employee();

		Devloper Dev = new Devloper();
		Dev.name = "Sumant";
		Dev.salary = 470000;
		Dev.programminglanguage ="Java";
		
		Dev.displayDetails();
		Dev.displayDeveloperInfo();
		//emp.displayDetails();

	}

}
class Employee{
	String name;
	int salary;
	
	public void displayDetails() {
		System.out.println("Parent name is displaying");
	}
}
class Devloper extends Employee{
	String programminglanguage;
	public void displayDeveloperInfo() {
		System.out.println("Parent name is : " + name);
		System.out.println("Parent salary is : " + salary);
		System.out.println("Programming Language is : " + programminglanguage);
	}
}