package basic;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int n = 100, sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.print("Sum of Natural number is : "+ sum);
	}

}
