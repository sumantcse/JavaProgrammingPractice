package ArraysPractice;

public class CalculateTheAverageofElements {

	public static void main(String[] args) {
		float[] arr = {50.2333f,10,15};
		int n = arr.length;
		if(n == 0) {
			System.out.print("Array is empty");
			return;
		}
		float sum = 0;
		for(float num : arr) {
			sum += num;	
		}
		float average = sum / n;
		System.out.printf("Average value is: %.2f",average);

	}

}
