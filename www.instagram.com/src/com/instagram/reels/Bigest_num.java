package com.instagram.reels;

public class Bigest_num {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if((a>b)&&(a>c)) {
			System.out.println("a is bigest");
		}else if((b>c)&&((b>a))) {
			System.out.println("b is bigest");
		}else {
			System.out.println("c is bigest");
		}
	}

}
