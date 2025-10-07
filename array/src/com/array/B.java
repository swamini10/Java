package com.array;

public class B {
public static void main(String[] args) {
	int [] salaries=new int [4];
	salaries[0]=10000;
	salaries[1]=30000;
	salaries[2]=939393;
	salaries[3]=393939;
	
	System.out.println(salaries[3]);//it will print only specified index input
	
	//for (int i=0;i<salaries.length;i++) {
		//System.out.println(salaries[i]);
	//}//it will give the whole array


for(int salary:salaries) {
	System.out.println(salary);
}
}
}
