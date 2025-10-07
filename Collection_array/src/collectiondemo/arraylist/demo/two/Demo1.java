package collectiondemo.arraylist.demo.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
	
	List<Integer>allList =new ArrayList<Integer>();
	for(int i=0;i<100;i++) {
		allList.add(i);
		
		}
	System.out.println(allList);
	Iterator<Integer> itr =allList.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}

