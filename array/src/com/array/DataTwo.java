package com.array;

public class DataTwo {
	public static int[] getSum(int arr[],int sum) {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					return  new int[] {arr[i],arr[j]};
				}
			}
		}
		return new int[] {0,0};
		
	}




public static void main(String[] args) {
	int[] arr= {6,3,5,7,10};
	System.out.println(DataTwo.getSum(arr, 9));
}
}