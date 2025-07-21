package ArraysPractice;

public class SecondMaxNumber {

	public static void main(String[] args) {
		int[] arr = {0,3,43,2,65,57};
		int n = arr.length;
		int First_Max = arr[0];
		int second_Max = -1;
	
		if(n == 0) {
			System.out.print("Arrays is Empty");
			return;
		}
		for(int i = 1; i < n; i++) {
			if(First_Max < arr[i]) {
				second_Max = First_Max;
				First_Max = arr[i];
			}else if(second_Max < arr[i] && arr[i] != First_Max) {
				second_Max = arr[i];
			}
			
		}
		
		System.out.println("Second max is: "+second_Max);
	}

}
