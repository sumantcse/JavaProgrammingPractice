package ArraysPractice;

public class SumOfElement {

	public static void main(String[] args) {
		int[] arr = {5,10,15};
		//double[] arr1 = {10.5,14.23,32.93};
		if(arr.length == 0) {
			System.out.print("Array is empty");
			return;
		}
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		System.out.println("sum of all element which is availble in array is: "+ sum);
//		double sum1 = 0.0;
//		for(double num : arr1) {
//			sum += num;
//		}
//		System.out.print("sum of all double type element "+ sum);
		// TODO Auto-generated method stub

	}

}
