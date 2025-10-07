package com.forloop.demo;

public class Continue {
	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}
}
