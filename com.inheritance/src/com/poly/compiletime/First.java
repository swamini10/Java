package com.poly.compiletime;

public class First {
	public void m1(String a) {
		System.out.println("D");
	}
	public void m1(int a,String b) {
		System.out.println("F");
		
	}
	public void m1(float a) {
		System.out.println("E");
	}
	
	public void m1() {
		System.out.println("B");
	}
	
	public void m1(int a) {
		System.out.println("A");
		}
	public void m1(int a,int b, int c) {
		System.out.println("P");
	}
	
	public static void main(String[] args) {
		First fs=new First();
		//fs.m1(10.3f);
		//fs.m1("Swapnil");
		//fs.m1(10,20,30);
		fs.m1(17,"Swapnil");
		
		
	}
	}
