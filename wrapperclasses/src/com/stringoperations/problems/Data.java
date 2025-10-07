package com.stringoperations.problems;

public class Data {
	public static String getString(String str) {
		str=str.toUpperCase();
		str=str.replaceAll("[0-9]", "_");
		return str;
		
	}
	public static int getOperation(String a) {
		int i;
		int total=0;
		int preValue=0;
		
		
		for(i=a.length()-1;i>=0;i--) {
			char ch=a.charAt(i);
			int value=0;
			
			if(ch=='I')value=1;
			else if(ch=='V')value=5;
			else if (ch=='X')value=10;
			else if (ch=='L')value=50;
			else if (ch=='C')value=100;
			else if (ch=='D')value=500;
			else if (ch=='M')value=1000;
			
			if (preValue<value) {
				total-=value;
			}else {
				total+=value;
			}
			
			preValue=value;
			
			
		
			
		}
		
		return total;
	}
	
	public static int roman(String b);
	
	public static void main(String[] args) {
//		String a="aShisH";
//		String b="swaPNALi";
//		String c="sBpcoe135";
//		String d="pra1712jakti";
//		System.out.println(getString(a));
//		System.out.println(getString(b));
//		System.out.println(getString(c));
//		System.out.println(getString(d));
		
		//Character.isAlpahbetic(a.charAt(0));
		//a.charAt(0);
		
		//Character.isDigit(a,charAt(6));
		
		//I-->1
		//V-->5
		//X-->10
		//L-->50
		//C-->100
		//D-->500
		//M-->1000
		
		
		
	}

}
