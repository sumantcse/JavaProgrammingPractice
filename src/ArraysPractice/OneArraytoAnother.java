package ArraysPractice;

public class OneArraytoAnother {

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,7,7}; 
		int[] arr1 = new int[arr.length];
		System.out.print("Original Array is: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			arr1[i] = arr[i];
		}
		System.out.println();
		System.out.print("Copy array is: ");
		for(int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j]+" ");
		}
		
	}

}
