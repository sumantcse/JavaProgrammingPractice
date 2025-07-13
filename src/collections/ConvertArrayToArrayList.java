package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String[] arr = {"Red", "Green", "Blue"};
		List al = Arrays.asList(arr);
		System.out.println(al);
		for(String ar : arr) {
		System.out.println(ar+" ");
		}
		Collections.sort(al);
		System.out.print(al);
	}

}
