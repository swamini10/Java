package com.instagram.reels;

public class First {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		String e = (a > b)? "b is greater":"a is greater";
		System.out.println(e);
		
		
		System.out.println((a<b)&(b<c));
		System.out.println((a<b)&(b>c));
		System.out.println((c<b)&(b>c));
		System.out.println((c<b)&(b<a));
	}

}
