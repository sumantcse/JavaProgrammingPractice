/*Task:
Update the Person class:

Make fields private

Add public getter and setter methods

In main(), use these methods to set and get data*/


package oops;
 class PersonName{
	private String name;
	private int age;
	
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			if(age > 0) {
				this.age =age;
			}else {
				System.out.println("Age can't be nagative,");
			}
		}
		public int getAge() {
			return age;
		}
}
public class EncapsulationProblem {

	public static void main(String[] args) {
		PersonName p1 = new PersonName();
		p1.setName("Sumant");
		p1.setAge(25);
		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
	}

}
 