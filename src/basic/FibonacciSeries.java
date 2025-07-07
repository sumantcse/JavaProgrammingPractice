package basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 10, first_number = 0, second_number = 1, next_term = 0;
		for(int i = 1; i <= number; i++) {
			System.out.print(first_number+" ");
			next_term = first_number + second_number;
			first_number = second_number;
			second_number = next_term;
		}

	}

}
