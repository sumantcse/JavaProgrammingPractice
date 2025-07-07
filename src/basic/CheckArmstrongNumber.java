package basic;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		int num = 121;
		int remainder, result = 0	;
		int original = num;
		while(num != 0) {
			remainder = num % 10;
			result += Math.pow(remainder, 3);
			num = num / 10;
		}
		if(original == result) 
			System.out.println(original+" is an armstromg number");
		else
			System.out.println(original+" is not an armstromg number");
	}

}
