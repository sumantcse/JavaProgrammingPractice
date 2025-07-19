//Write a code to move all zeros to the beginning of this array: 16, 8. 7. 0. 5, 0, 3.01.
package ArraysPractice;

import java.util.Arrays;

public class MoveAllZeroinStart {

	public static void main(String[] args) {
		double[] arr = {16, 8, 7, 0, 5, 0, 3.01};
		Arrays.sort(arr);
		for(double num : arr) {
		System.out.print(num+" ");
		}
		
	}

}
