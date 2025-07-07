package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 5, b = 3;
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.print("a = "+a+", b = "+ b);

	}

}
