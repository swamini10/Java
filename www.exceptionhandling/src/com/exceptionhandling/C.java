package com.exceptionhandling;

public class C {
	public static void main(String[] args) {
	int marks[]= new int[5];
	marks[0]=10;
	marks[1]=50;
	marks[2]=60;
	marks[3]=70;
	marks[4]=80;
	marks[5]=90;
	
	System.out.println(marks[6]);
	
	for(int a: marks ) {
		System.out.println(a);
	}
	}
}
//it is an ArrayIndexOutOfBoundsException