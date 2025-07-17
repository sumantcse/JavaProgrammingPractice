// Problem 8: Check if an Array Contains a Specific Element
package ArraysPractice;

public class ContainsSpecificElement {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9};
		int target = 55;
		boolean found = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				System.out.print("Element "+ target+ " found at index "+ i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.print("Element "+target+" is not found");
		}
	}

}
