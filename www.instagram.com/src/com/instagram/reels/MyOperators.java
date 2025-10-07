package com.instagram.reels;

public class MyOperators {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println((a<b)&&(b<c));
		System.out.println((a<b)&&(b>c));
		System.out.println((c<b)&&(b>c));
		System.out.println((c<b)&&(b<a));
		
		System.out.println((a<b)||(c<b));
		System.out.println((c<b)||(b>a));
		System.out.println((b<a)||(c>b));
		System.out.println((c<b)||(b<a));
	}

}
