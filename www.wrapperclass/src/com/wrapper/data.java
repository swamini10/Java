package com.wrapper;

public class data {
	
	public static String getString(String str) {
		//code here
//		if(Character.isDigit(str.charAt(7))){
//			str.toUpperCase();
//		}else {
//			str.replaceAll(str, "_");
//		}
		return str;
	}
	public static void main(String[] args) {
		//input: "Swamini"
		//oupput:SWAMINI
		//input: "SwAmini123"
		//oupput:SWAMINI___
		
		String str="swamini123";
		System.out.println(str.replaceAll(str, "_"));
		System.out.println(str.replaceAll("\\d", "_"));
	//	str.replace((str.charAt(7)), str)
//		
//		boolean a = Character.isDigit(str.charAt(7));
//		 Boolean.toString(a);
//		//?(str.replaceAll(str, "_")):(str.toUpperCase());
//		String str1 =getString(str);
//		System.out.println(data.getString(str));
//		
		
//		if(str==\\d{4}){
//			System.out.println(str.replaceAll(str, "_"));
//		
//		}else {
//			System.out.println(str.toUpperCase());
//		}
	}

}
