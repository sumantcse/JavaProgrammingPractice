package oops;

public class PolymorphismPractice {

	public static void main(String[] args) {
		dog d = new dog();
		d.makeSound();
		 calculator c = new calculator();
		 
		 System.out.println("Sum of two integer number: "+ c.add(2, 6));
		 System.out.println("Sum of two double number: "+ c.add(2.3, 3.2));
		 System.out.println("Sum of three integer number "+ c.add(5, 6, 7));
	}

}
class Animal{
	public void makeSound(){
		System.out.println("Animal makes a sound");
	}
}
class dog extends Animal{
	@Override 
	public void makeSound() {
		
		System.out.println("Dog barks");
	}
}
// overloading example
class calculator{
	public int add(int a, int b) {
		return a + b;
	}
	public double add(double a, double b) {
		return a + b;
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}