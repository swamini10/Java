package com.encapsulationdemo.demo;

import java.util.Scanner;

public class Data {
	Employee emp2 = new Employee();
	
	Scanner sc = new Scanner(System.in);
	
	public void setData() {
		System.out.println("Enter EmployeeId");
		int empId = sc.nextInt();
		emp2.setEmpId(empId);
		
		System.out.println("Enter name");
		emp2.setName(sc.next());
		
		System.out.println("Enter City name");
		emp2.setCity(sc.next());
		System.out.println("Data added");
	}
	
	public void getData() {
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getName());
		System.out.println(emp2.getCity());
	}
	
//	public static void main(String[] args) {
//		Data db = new Data();
//		db.setData();
//		db.getData();
//	}
}

