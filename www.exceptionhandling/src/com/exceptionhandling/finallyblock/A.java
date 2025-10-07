package com.exceptionhandling.finallyblock;

public class A {
	public static void main(String[] args) {
		try{
		int a=0;
		int b=0;
		System.out.println(a/b);
	}catch(Exception e){	
		System.out.println("inside the catch ");
	}finally{
		System.out.println("inside the finally ");
	}
 }
}

// finally block execute alway 