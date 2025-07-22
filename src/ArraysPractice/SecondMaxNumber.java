package ArraysPractice;

public class SecondMaxNumber {

	public static void main(String[] args) {
		int[] arr = {28078, 19451, 935, 28892, 2242, 3570, 5480, 231};
		int n = arr.length;
		int First_Max = -1;
		int second_Max = -1;
	
		if(n == 0) {
			System.out.print("Arrays is Empty");
			return;
		}
		for(int i = 0; i < n; i++) {
			if(First_Max < arr[i]) {				
				First_Max = arr[i];
			}
		}	
		for(int i = 0; i < n; i++) {
			 if(arr[i] > second_Max && arr[i] != First_Max) {
				second_Max = arr[i];
			}
			
		}
		
		System.out.println("Second max is: "+second_Max);
	}

}
