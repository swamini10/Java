package com.Dowhile.demo;

public class Fibonacci_ser {
	public static void main(String[] args) {
		int i = 1;
		int n = 10;
		int firstterm = 0;
		int secondterm = 1;
		do {
			int nextterm = firstterm + secondterm;
			System.out.println(nextterm);
			firstterm = secondterm;
			secondterm = nextterm;
			i++;
		}while(i < n);
	}

}
