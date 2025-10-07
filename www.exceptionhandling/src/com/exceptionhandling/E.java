package com.exceptionhandling;

public class E {
	public static void main(String[] args) {
		try {
		String s="swamini";
		System.out.println(s.charAt(8));
	} catch(NullPointerException e) {
		System.out.println("handled");
	}catch(ArithmeticException e) {
		System.out.println("handled1");
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("handled2");
	}catch(Exception e) {
		System.out.println("handled3");
	}
 }
}

// this is String Index Out Of Bounds Exception

/* this exception handle by 
 catch(String Index Out Of Bounds Exception e)
 catch(Index Out Of Bounds Exception e)
 catch(Run Time Exception e)
 catch(Exception e)
*/