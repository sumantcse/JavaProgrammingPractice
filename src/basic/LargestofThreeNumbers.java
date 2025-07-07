package basic;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		int a = 1, b = 123, c = 11;
		if(a >= b && a >= c) {
			System.out.println(a+" is the largest number");
		}else if(b >= a && b >= c) {
			System.out.println(b+" is the largest number");
		}else {
			System.out.println(c+" is the largest number");
		}
	}

}
