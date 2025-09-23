package com.exceptionhandling.throww;

public class B {
	public static void main(String[] args) {
		//100000 lines of code
		try {
			throw new ArithmeticException();
		}
		//problem in 10000 lines of code
	catch(Exception e) {
		//1000 lines of code
	}
  }
}

// throw is used to throw an Exception 
// its main use is show an exception 
