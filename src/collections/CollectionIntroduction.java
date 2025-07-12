package collections;

import java.util.ArrayList;

public class CollectionIntroduction {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Apple");
		arr.add("Banana");
		arr.add("Orange");
		arr.add("Banana");
		

		// Print all elements using:for loop
				for(int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i));
				}
//				// Print all elements using:for each loop
//				for(String fruit : arr) {
//					System.out.println(fruit);
//				}
		System.out.println("removed banana: "+arr.remove(1));
		
		if(arr.contains("mango")) {
			System.out.println("Mango is present in Array List");
		}else {
			System.out.println("Mango is not present in Array List");
		}
		
		
		
		System.out.print("Size of array list is: "+ arr.size());
	}
}
