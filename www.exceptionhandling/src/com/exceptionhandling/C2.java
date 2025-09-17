package com.exceptionhandling;

public class C2 {
	public static void main(String[] args) {
		try {
	int marks[]= new int[5];
	marks[0]=10;
	marks[1]=50;
	marks[2]=60;
	marks[3]=70;
	marks[4]=80;
	marks[5]=90;
	
	System.out.println(marks[6]);
}catch(Exception e){
			
		System.out.println("index of out of range ");
	}
	}
}
//it is an ArrayIndexOutOfBoundsException it handle by using try catch block