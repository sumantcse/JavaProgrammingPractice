package oops;

public class InheritancePractice {

	public static void main(String[] args) {
		Devloper emp = new Devloper();
		emp.name = "Sumant";
		emp.salary = 470000;
		emp.programminglanguage ="Java";
		
		emp.displayDeveloperInfo();
		emp.displayDetails();

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
		System.out.println("Programming Language is : " + programminglanguage);
	}
}