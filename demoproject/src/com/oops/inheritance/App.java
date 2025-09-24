package com.oops.inheritance;

public class App {
	public void m1() {
		System.out.println("a");
	}
	public  void m1(int a) {
		System.out.println("b");
	}
	public void m1(String b) {
		System.out.println("c");
	}                                                           // overloading without static fun


	
	public static  void m2() {
		System.out.println("0");
	}
	public static void m2(int a) {
		System.out.println("a");
	}
	public static void m2(String a) {
		System.out.println("b");

	}                                                      //overloading with static function
	
	
	
	
	public static void main(String args[]) {
		App ap = new App();
		ap.m1();
		ap.m1(12);
		
		
		
		
		
		App.m2(12);
		App.m2("swapnil");                                    
	}
}
