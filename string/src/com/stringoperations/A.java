package com.stringoperations;

public class A {
	public static void main(String[] args) {
		String a="Ashish";//string is a collection of characters and also string is a class
		System.out.println(a);
		
		String b=new String ("SBPCOE");//since string is a class we can create an object of string
		System.out.println(b);
		
		char [] c= {'a','p','p','l','e'};//also string could be created...first creating an array then calling the same array using an object
		String d=new String(c);
		System.out.println(d);
	}

}
