package ArraysPractice;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] array = {50,20,23,40,10};
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.print("Max number is given array is: "+ max);
	}

}
