package com.encapsulationdemo.demo.two;

public class Student {
	private int rollNo;
	private String name;
	private String city;
	
	public Student(int rollNo, String name, String city) {
		this.rollNo=rollNo;
		this.name=name;
		this.city=city;
	}
	
	Student(){
		
	}
	
	public void setRollNo(int rollno) {
		this.rollNo = rollno;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getcity() {
		return city;
	}
	
	public String toSting() {
		return "Student[name: "+name+" rollno: "+rollNo+" city: "+city+" ]";
	}
	
}
