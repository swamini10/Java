package Deque_collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
	ArrayDeque<Integer> data = new ArrayDeque<Integer>();
	data.add(37);
	data.add(7);
	data.add(25);
	data.add(97);
	System.out.println(data);
	data.addFirst(10);
	System.out.println(data);
	data.addLast(50);
	System.out.println(data);
	System.out.println(data.removeFirst());
	System.out.println(data);
	System.out.println(data.removeLast());
	System.out.println(data);
	
	}
}
