package com.array;

public class Data {
	public static int findRollNumber(int [] rollNos, int rollNo) {
		
		for(int i=0;i< rollNos.length;i++) {
			if(rollNo==rollNos[i]) {
				return i;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int rolls[]= {10,20,9,7,60};
		System.out.println(Data.findRollNumber(rolls, 9));
	}
}
