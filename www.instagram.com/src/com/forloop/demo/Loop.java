package com.forloop.demo;

public class Loop {
	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
	}
}
