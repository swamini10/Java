package com.demoproject.one.whileloop;

public class Demo2 {
	public static void main (String[]args) {
		int i=0;
		while (i<10) {
			//i++;
			if(i==5) {
				i++;
				break;//stop hoto loop
				
			}else {
				i++;
				System.out.println(i);
			}
		}
	}

}
