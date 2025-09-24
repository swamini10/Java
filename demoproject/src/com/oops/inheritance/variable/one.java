package com.oops.inheritance.variable;

public class one {
	int a=0;
	int b=2;
	
	public static  void sum(int a,int b) {
		System.out.println(Math.max(a, b));
	}
	public static void main(String args[]) {
		one on=new one();
		on.sum(0, 0);
	}

}
