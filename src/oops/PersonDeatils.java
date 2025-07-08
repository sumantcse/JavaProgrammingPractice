package oops;

public class PersonDeatils {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Sumant";
		p1.age = 25;
		p1.height = 172.5;
		
		Person p2 = new Person();
		p2.name = "Hemant";
		p2.age = 30;
		p2.height = 172.0;
		
		p1.DisplayDetails();
		System.out.println("- - - - - - -");
		p2.DisplayDetails();

	}	
}

class Person{
	String name;
	int age;
	double height;
void DisplayDetails() {
	System.out.println("Name : "+ name);
	System.out.println("Age : "+age);
	System.out.println("Height : "+height +" cm");
	}
}