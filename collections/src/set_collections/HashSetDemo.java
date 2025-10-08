package set_collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> values =new HashSet<Integer>();
		values.add(30);
		values.add(10);
		values.add(20);
		values.add(40);
		values.add(35);
		values.add(5);
		values.add(10);
		values.add(null);
		values.add(null);
		values.add(5);
		System.out.println(values);
	}

}
//hash value 
// duplicates are not allow
// null value can be inserted only once
//insertion order is not preserved 