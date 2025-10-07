package stack_collections;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack<Integer> st= new Stack<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		st.add(60);
		
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
	}

}
