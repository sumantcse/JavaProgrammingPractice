package ArraysPractice;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int array[] = {10,20,2,1,1};

		if(array.length == 0) {
			System.out.println("Array is Empty ");
			return;
		}
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.print("Max number is given array is: "+ max);
	}
}
