
package ArraysPractice;

public class MinimumAndMaximum_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,1,2,4};
		int n = arr.length;
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max value in Array is: " + max);
		System.out.println("Min value in Array is: " + min);
	}
	

}
