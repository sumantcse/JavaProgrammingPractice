package basic;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int num = 1;
		boolean flag = false;
		if(num == 0 || num == 1) {
			flag = false;
		}
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println(num+" is a Prime Number.");
		}else {
			System.out.println(num+" is not a Prime number.");
		}
	}

}
