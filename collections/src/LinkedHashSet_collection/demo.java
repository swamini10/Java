package LinkedHashSet_collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class demo {
	public static void main(String[] args) {
		Set<Integer> values =new LinkedHashSet<Integer>();
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
//insertion order preserved
//duplicates are not allow
//null value can be inserted only once