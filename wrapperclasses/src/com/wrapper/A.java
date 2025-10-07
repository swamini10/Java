package com.wrapper;

public class A {
	public static void main(String[] args) {
		int a=10;
		Integer ab=200; //here 200 is int only but the variable it is known by is an Integer class
		//i.e. primitive---->wrapper classes/non primitive (Autoboxing)
		
		Integer ac=a;
		
		Integer e=200;
		int f=e;//wrapper--->primitive(Unboxing)
		
		//primitive--->wrapper--->String
		
		int abc=1002;
		String num=Integer.toString(abc);
		
		//primitive--->String
		
		String opq=String.valueOf(abc);
	
		System.out.println(num);
		
		//String--->primitive
		String num1="82919";
		int num2=Integer.parseInt(num1);
		System.out.println(num2);
		
//		String name="Ashish";									qqy
//		int num3=Integer.parseInt(name);// will throw exception because string cant be changed in number
//		
//		System.out.println(num3);
		
		//wrapper --->String
		
		Integer num4=3829;
		String num5=num4.toString(num4);
		System.out.println(num5);
		
	    Float num6=34.5f;
	    String num7=num6.toString(num6);
	    System.out.println(num6);
	    
	    //String--->Wrapper
	   
	    String num8="3456";
	    Integer num9=Integer.valueOf(num8);
	    System.out.println(num9);
	    
	   
	}

}
