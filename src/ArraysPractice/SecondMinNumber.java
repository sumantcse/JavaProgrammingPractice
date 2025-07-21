package ArraysPractice;

public class SecondMinNumber {

	public static void main(String[] args) {
		int[] arr = {2,3,4,2,434,-1,3,0,-2};
		int first_min = arr[0];
		int second_min = arr[1];
		if(arr.length == 0) {
			System.out.print("Aarray is empty");
			return;
		}
		for(int i = 2; i < arr.length; i++) {
			if(first_min > arr[i]) {
				first_min = arr[i];
				second_min = first_min;
			}else if(second_min > arr[i] && first_min != arr[i]) {
				second_min = arr[i];
			}
		}
		System.out.print("Second min number is: "+second_min);
	}

}
