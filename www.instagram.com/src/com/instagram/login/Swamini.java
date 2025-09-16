package com.instagram.login;

public class Swamini {
	public static void main(String[] args) {
		byte a = 127;
		short b=32767;
		int c=199;
		long d= 299;
		
		float e= 2.3f;
		double f= 20.2d;
		char g = 65;
		
//		65--> A
//		66--> B
//		67 --> c
		
		// impliscit type casting
		//smaller to larger
		byte s=10;
		int r=s;
		short x = 20;
		long y = c;
		
		System.out.println(s);
		System.out.println(c);
		
		//larger to smaller
		//Explicit type casting
		int A = 100;
		byte B = (byte) A;
		
		int C = 134;
		byte D = (byte) C;
		
		System.out.println(D);
		
		
	}

}
