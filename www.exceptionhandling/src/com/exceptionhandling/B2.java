package com.exceptionhandling;

public class B2 {
	public static void main(String[] args) {
		try{
			String s="Swamini";
		int b =Integer.parseInt(s);
		
		System.out.println(b);
	}catch(Exception e){
		
		System.out.println("we cannot convert string into int ");
	}
	}

}
//it is an NumberFormatException it handle by using try catch block