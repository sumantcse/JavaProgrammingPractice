package basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int number = 121, reverse = 0, remainder;
		int Original = number;
		while(number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		if(Original == reverse) {
			System.out.println( Original +" is a palindrome");
		}else{
			System.out.println( Original +" is not a palindrome");
		}
	}

}
