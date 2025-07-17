package ArraysPractice;

public class FirstOccurrenceofGivenElement {

	public static void main(String[] args) {
		int[] arr = {4, 2, 7, 2, 9};
		int target = 20;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.println("First occurrence index: " + index);
		}else {
			System.out.println("Element " + target + " not found in the array.");
		}
	}

}
