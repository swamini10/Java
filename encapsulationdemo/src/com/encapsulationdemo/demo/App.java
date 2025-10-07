package com.encapsulationdemo.demo;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(7285);
		emp.setName("Swamini");
		emp.setCity("pune");
		emp.setHasAdhar(true);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getCity());
		System.out.println(emp.getHasAdhar());
		System.out.println("***************************************");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(7345);
		emp1.setName("Soham");
		emp1.setCity("Pune");
		emp1.setHasAdhar(true);
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getCity());
		System.out.println(emp1.getHasAdhar());
	}
}
