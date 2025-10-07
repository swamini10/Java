package com.exceptionhandling;

public class d2 {
	public static void main(String[] args) {
		try {
		String s="swamini";
		System.out.println(s.charAt(8));
	}  catch(StringIndexOutOfBoundsException e) {
		System.out.println("Handle By String Index Out Of Bounds Exception");
	}
		 catch(IndexOutOfBoundsException e) {
			 System.out.println("Handle By Index Out Of Bounds Exception "); 
		 }
		 catch(RuntimeException e) {
			 System.out.println("Handle By Run Time Exception "); 
		 }
		 catch(Exception e) {
			 System.out.println("Handle By Exception"); 
		 }
	}

}
