package com.exceptionhandling;

public class demo {
	public static void main(String[] args) {
		try {
			int a=20;
			int b=0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("handled by ArithmeticException");
		}catch(RuntimeException e) {
			System.out.println("handled by RuntimeException");
		}catch(Exception e) {
			System.out.println("handled by Exception");
		}
	}
}


/*
 * in single try we can create multiple catch block
here in  exception handling suppose we handle arithmetic exception we cannot use first parent class of 
arithmetic exception  we need to use first child class then use parent class 
*/

//parent class can handle that exception so no need of child class exception that is show an error 

