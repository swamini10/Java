package com.exceptionhandling;

public class A2 {
	public static void main(String[] args) {
		try{
		int a=0;
		int b=0;
		System.out.println(a/b);
	}catch(Exception e){
		
		System.out.println("result is undefined ");
	}
	}

}
// it is an ArithmeticException it handle by using try catch block