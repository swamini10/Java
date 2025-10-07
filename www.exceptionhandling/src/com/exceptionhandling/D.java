package com.exceptionhandling;

public class D {
	public static void main(String[] args) {
		try {
		String s="swamini";
		System.out.println(s.charAt(8));
	} catch(Exception e) {
		System.out.println("handled");
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

/*after try block next catch block execute 
we can not can write and print statement and and other code between this two block
try block finish then catch block start execute 
*/