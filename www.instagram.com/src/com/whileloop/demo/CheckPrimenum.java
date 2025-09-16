package com.whileloop.demo;

public class CheckPrimenum {
	public static void main(String[] args) {
		int  i = 2 ;
		int n = 55;
		boolean isprime = true;
		while(i <= n-1) {
			if(n % i == 0) {
				isprime = false; 
			}
			   i++;
	     }if(isprime == true) {
			 System.out.println("this is prime num");
	      }else {
			 System.out.println("this is not prime num");
		}	
	}

}
