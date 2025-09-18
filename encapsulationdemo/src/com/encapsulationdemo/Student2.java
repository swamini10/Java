package com.encapsulationdemo;

public class Student2 {
	int rollNo;
	String name;
	
	public static void main(String[] args) {
		Student st = new Student();
		st.rollNo = 111;
		st.name ="Ashish";
		
		Student st1 = new Student();
		st1.rollNo = 555;
		st1.name = "Om";
		
		st.rollNo = 999;
		System.out.println(st.rollNo);
		System.out.println(st1.name);
		System.out.println(st.name);
		System.out.println(st1.rollNo);
	}
}
