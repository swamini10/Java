package com.whileloop.demo;

public class AnotherDemo {
	public static void main(String[] args) {
		int i = 0;
		while(i<10) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
