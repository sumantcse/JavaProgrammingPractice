package ArraysPractice;

import java.util.HashSet;

public class RemoveDuplicateElementsfromanArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		int n = arr.length;
		HashSet<Integer> hash = new HashSet<>();
		for(int num : arr) {
			hash.add(num);
		}
		System.out.print("Array after removing the element: ");
		for(int ar : hash) {
			System.out.print(ar+" ");
		}
	}

}
