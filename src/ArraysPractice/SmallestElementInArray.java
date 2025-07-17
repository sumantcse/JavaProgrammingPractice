package ArraysPractice;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int[] arr = {12, 5, -3, 22, 9};
		//int[] arr = {-10, -50, -2, -999};  # Negative cases
		if(arr.length == 0) {
			System.out.print("given array is Empty");
			return;
		}
		int min = arr[0];
		for(int num : arr) {
			if(num < min) {
				min = num;
			}
		}
		System.out.println("Smallest number in the given Array is: "+min);
	}

}
