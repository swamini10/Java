package com.encapsulationdemo.demo;

public class Employee {
	private int empId;
	private String name;
	private String city;
	private boolean hasAdhar;
	
	public void setHasAdhar(boolean hasAdhar) {
		this.hasAdhar = hasAdhar;
	}
	
	public boolean getHasAdhar() {
		return hasAdhar;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getName() {
		return name;
	}
}
