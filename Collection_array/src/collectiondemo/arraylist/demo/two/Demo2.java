package collectiondemo.arraylist.demo.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo2 {
	public static void main(String[] args) {
	List<Integer>allList =new ArrayList<Integer>();
	for(int i=0;i<100;i++) {
		allList.add(i);
		
		}
	System.out.println(allList);
//	Iterator<Integer> itr =allList.iterator();
//	
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	
	ListIterator<Integer> listIterator =allList.listIterator();
	System.out.println("****************************");
	while(listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	System.out.println("****************************");
	while(listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
	}
	}
}
//iterator not use hasPrevious()
//ListIterator not use hasPrevious() and hasNext()
