package vector_collections;

import java.util.Vector;

public class App {
	public static void main(String[] args) {
		//array list 50% increese hoti 
		Vector<Integer> vector =new Vector <>(); // legacy -old dynamic array
	    vector.add(7489);
	    //slow as compare to arraylist
	    
	    vector.addElement(567);
	    for(int i=0;i<11;i++) {
	    	vector.add(i);
	    }
	    System.out.println(vector);
	    vector.add(3);
	    System.out.println(vector);
	    vector.add(21);
	 for(int i=22;i<41;i++) {
	    	vector.add(i);
	    }
	    System.out.println(vector.size());
	    vector.add(41);
	    System.out.println(vector.capacity());
	    System.out.println(vector);
	    
	    for(int i=42;i<81;i++) {
	    	vector.add(i);
	    }  
	    vector.add(99);
	    System.out.println(vector.capacity());
	    
	}
}
