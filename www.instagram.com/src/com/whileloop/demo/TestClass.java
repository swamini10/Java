package com.whileloop.demo;

public class TestClass {
	public static void main(String[] args) {
		int i = 0;
		while(i<10) {
			if(i==5) {
				i++;
				break;
			}else {
				i++;
				System.out.println(i);
			}
		}
	}

}
