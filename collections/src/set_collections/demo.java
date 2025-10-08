package set_collections;

import java.util.HashSet;
import java.util.Set;

public class demo {
	public static void main(String[] args) {
		Set<String> names =new HashSet<String>();
		names.add("swamini");
		names.add("soham");
		names.add("gayu");
		System.out.println(names);
		for(String name :names) {
		System.out.println(names+"hashCode:"+names.hashCode());
		}
	}

}
