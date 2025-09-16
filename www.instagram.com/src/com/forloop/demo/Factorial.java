package com.forloop.demo;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		
		for(int i=1; i<=5; i++){
			fact *= i;
		}
		System.out.println(fact);
		
	}
}
