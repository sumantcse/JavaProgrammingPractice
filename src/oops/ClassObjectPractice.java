package oops;

public class ClassObjectPractice {

	public static void main(String[] args) {
		Lamp led = new Lamp();
		Lamp helogen = new Lamp();
		
		led.turnOn();
		helogen.turnOff();
//		Mobile m = new Mobile();
//		m.Brand = "SAMSUNG";
//		m.price = 25000.25;
//		m.RAM = "8GB";
//		
//		m.MobileFeature();
//
//	}
//
//}
//class Mobile{
//	String Brand;
//	double price;
//	String RAM;
//	void MobileFeature() { 
//		System.out.print("Mobile Brand name is "+Brand+" And "+"Price is "+price+"  and RAM is "+RAM);
	}
	
}
	class Lamp{
		boolean isOn;
		
		void turnOn() {
			isOn = true;
			System.out.println("Light on? "+ isOn);
		}
		void turnOff() {
			isOn = false;
			System.out.println("Light on? "+ isOn);
		}
	}