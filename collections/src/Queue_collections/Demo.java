package Queue_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue<Integer> nums =new PriorityQueue<Integer>();
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(40);
		nums.add(35);
		nums.add(5);
		
		// sort by min heap -->Insert
		//insertion order is not preserved in .... min heap
		System.out.println(nums.peek());
		System.out.println(nums);
		
	}

}
