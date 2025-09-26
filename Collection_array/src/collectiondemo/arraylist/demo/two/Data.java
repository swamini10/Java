package collectiondemo.arraylist.demo.two;

import java.util.ArrayList;
import java.util.List;


public class Data {
	public static void main(String[] args) {
		
	
		List<Integer>data =new ArrayList<>();
		data.add(234);
		data.add(276);
		data.add(765);
		data.add(312);
		
		System.out.println(data);
		data.set(2, 00);
		// Updates/replaces the element at index 2 with 00 
		System.out.println(data.size());
		// Prints the current size (number of elements)
		System.out.println(data);
		// data.clear(); 
		// If uncommented, this will remove ALL elements from the list
		System.out.println(data);
		System.out.println(data.contains(234));
		// Checks if the list contains the element is present, returns true/false
		System.out.println(data.contains(134));
		data.addFirst(999);
		// Adds 999 at the beginning of the list
		System.out.println(data);
		data.addLast(999); 
		// Adds 999 at the end of the list
		System.out.println(data);

System.out.println(data.isEmpty());  
// Returns true if list is empty.

System.out.println(data.indexOf(999));  
//Returns first index of 999, -1 if not found.

System.out.println(data.lastIndexOf(999));  
//Returns last index of 999.

	
	}
}
