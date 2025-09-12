package com.wrapper;
// wrapperclasses(it is mostly used in collections )
	//	byte -> Byte
	//	char -> Char
	//	boolean -> Boolean
	//	double -> Double
	//	long -> Long 
//	premitive is converted into wrapper [Autoboxing]
//	 wrapper is converted into premitive  [Unboxing]
//  primative is converted into String
//  String is converted into primative
//  wapper is converted into string
//  string is converted into wapper

public class A {
	public static void main(String[] args) {
		
	 int a=10;
	 Integer ab=20;//int-> Integer it means Autoboxing happened
	 Integer ac=a;//Autoboxing
	 
	 Integer c=30; 
	 int b=c;// Integer-> int it means Unboxing happened
	 
	//primative ->String
	 int abc=07;
	 String s =Integer.toString(abc);//primative -> Wapper ->String
	 String x =String.valueOf(abc);//primative ->String
	 
	 System.out.println(s);
	 System.out.println(x); 
	 
	//String -> primative 
	 String num1 ="3333";
	 int num2 =Integer.parseInt(num1);
	 System.out.println(num2);
	 
	/* String str ="Swamini";    // this not possible 
	 int num =Integer.parseInt(str);
	 System.out.println(num);*/
	 
	 // wapper > string
	 Integer num3=3894;
	 String  num4=num3.toString();
	 System.out.println(num4);
	 
	Float num5=38.9f;
	 String  num6=num5.toString();
	 System.out.println(num6);
	 
	 //string -> wapper
	 String num7 ="707";
	 Integer num8 =Integer.valueOf(num7);
	 System.out.println(num8);
	 
	 String num11 ="707";
	 Float num9 =Float.valueOf(num11);
	 System.out.println(num9);
   }
}
