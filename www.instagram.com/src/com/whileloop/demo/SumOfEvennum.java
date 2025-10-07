package com.whileloop.demo;

public class SumOfEvennum {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i <= 50) {
			if(i%2 == 0) {
				sum = sum+i;
				System.out.println(sum);
				}
			i++;
		}
	}

}
