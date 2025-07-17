package ArraysPractice;

public class ReverseOrder {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,6};
		int n = arr.length;
//		int left = 0, right = n - 1;
//		while(left < right) {
//			int temp = arr[left];
//			arr[left] = arr[right];
//			arr[right] = temp;
//			 left++;
//			 right--;
//		}
		for(int i = n - 1; i >= 0; i-- ) {
			System.out.print(arr[i]+" ");
		}
//		for(int num : arr) {
//			System.out.print(num +" ");
//		}
	}		

}
