package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
//		using set collecton
		a.add("Java");
		a.add("Python");
		a.add("C");
		a.add("Java");
		a.add("Python");
		
//		ArrayList<String> uniqueList = new ArrayList<>(new LinkedHashSet<>(a));
//		
//		System.out.print("After removing the dupliate value: "+uniqueList);	
		
		// using loop with .conatines
		
		ArrayList<String> unique = new ArrayList<>();
		for(int i = 0; i < a.size(); i++){
			String item = a.get(i);
			if(!unique.contains(item)) {
				unique.add(item);
			}
		}
		System.out.println("After removing the dupliate value: "+unique);
	}

	
}
