package collectiondemo.arraylist.demo.two;

import java.util.ArrayList;
import java.util.List;

public class demo {
	public static void main(String[] args) {
	List<Integer>data =new ArrayList<>();
	
	List<Integer>dat =new ArrayList<>();
	dat.add(234);
	dat.add(276);
	dat.add(765);
	dat.add(312);
	
	System.out.println(data);
	data.add(21);
	data.add(2);
	data.add(7);
	data.add(2);
	dat.addAll(data);
	System.out.println("data :"+dat);
	System.out.println("after addAll data:"+data);
	System.out.println(data.indexOf(100));
	System.out.println(data.isEmpty());
}
}