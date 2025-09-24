package com.oops.inheritance;

public class A {
	
	
	public A(int a) {
		System.out.println("A");
	}
	public A(int a,int b) {
		System.out.println("B");
	}
	public A(String a,int b) {
		System.out.println("C");                // constructor overloading   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {

		A obj = new A(10);                      // calling constructor by creating only obj of class 
		A obj2 = new A(10,20);
		A obj3 = new A("swapn",10);
		
	}

}
