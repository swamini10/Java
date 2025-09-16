package com.array;

public class Data {
	public static int findRollNumber(int []rollNos,int rollNO) {
	
    for (int i = 0; i < rollNos.length; i++) {
        if (rollNos[i] == rollNO) {
            return i;
        }
    }
    return -1; // indicates not found
}
	
	public static void main(String[] args) {
		int rolls[]= {10,20,30,40,50};
		System.out.println(Data.findRollNumber(rolls,50));
	}

}
