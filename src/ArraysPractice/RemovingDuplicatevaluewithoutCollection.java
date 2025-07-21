package ArraysPractice;

public class RemovingDuplicatevaluewithoutCollection {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,33,3,3};
		int k = DuplicateValue(arr);
		System.out.print("After removing the duplicate number: ");
		for(int i = 0; i < k; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}		
		static int DuplicateValue(int[] arr) {
		int i = 0;
		for(int j = 1; j < arr.length; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}	
		return i + 1;
		
	}

}
