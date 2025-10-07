package com.encapsulationdemo.demo;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter value of a");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter value of b");
//		int b = sc.nextInt();
//		
//		System.out.println("Enter value of name");
//		String name = sc.next();
//		
//		System.out.println("Enter value of mark");
//		float mark = sc.nextFloat();
//		
//		
//		System.out.println(a+b);
//		
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmployeeId");
		int empId = sc.nextInt();
		emp.setEmpId(empId);
		
		System.out.println("Enter name");
		emp.setName(sc.next());
		
		System.out.println("Enter City name");
		emp.setCity(sc.next());
		
		System.out.println("Data added");
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getCity());
	}
}
