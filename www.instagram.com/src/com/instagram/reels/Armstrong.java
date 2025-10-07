package com.instagram.reels;

public class Armstrong {
	public static void main(String[] args) {
		int num ;
		int Sum = 0;
		for(num=1; num<= 1000; num++){
			int r = num%10;
		    Sum += (r*r*r);
		    num /= 10;
		    
		}
		if(Sum == num) {
			System.out.println("this is Armstrong Number");
		}else {
			System.out.println("this is not Armstrong Number");
		}
	}
}
