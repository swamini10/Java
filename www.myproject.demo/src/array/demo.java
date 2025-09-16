package com.array;

public class demo {
	public static void main(String[] args) {
		int [] salaries =new int[4];
		salaries [0]=10000;
		salaries [1]=20000;
		salaries [2]=30000;
		salaries [3]=40000;
		
		System.out.println(salaries [0]);//it return only one value 
		
		for (int i=0;i<salaries.length;i++) {
			//System.out.println(i);//it return index
			System.out.println(salaries [i]);//return all array values
		}
		
		
		//for each loop
	}

}
