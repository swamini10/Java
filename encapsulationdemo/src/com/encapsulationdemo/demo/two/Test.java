package com.encapsulationdemo.demo.two;

public class Test {
	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Swamini");
		st.setRollNo(22);
		st.setCity("Pune");
		
		Student st1 = new Student();
		st1.setName("Soham");
		st1.setRollNo(11);
		st1.setCity("Mumbai");
		
		System.out.println(st);
		System.out.println(st1);
		
		Student st3 = new Student(100, "Akash", "Pune");
		
		System.out.println(st3.getName());
		System.out.println(st3.getRollNo());
		System.out.println(st3.getcity());
		System.out.println(st3);
	}
}
