package com.demoproject.one.whileloop;

public class Demo1 {
	public static void main(String[]args) {
		int i=0;
		while (i<10) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
