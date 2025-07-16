package ArraysPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,2,2,2,3,3,3,3,4,5,6,7,8,9,10};
		HashSet<Integer> hash = new  HashSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					hash.add(arr[i]);
					}
				}
			}
			System.out.println(hash);
		}
		
	}


