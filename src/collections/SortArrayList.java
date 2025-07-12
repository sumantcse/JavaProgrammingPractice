package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(22);
		arr.add(21);
		arr.add(1);
		arr.add(0);
		Collections.sort(arr);
		System.out.println("Sorted Array List in asending order: "+ arr) ;
		Collections.reverse(arr);
		System.out.println("Desendig Array List in asending order: "+ arr);
		
		// TODO Auto-generated method stub

	}

}
