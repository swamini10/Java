package com.shopping;

public class Customer {
private int cusId;
private String name;
private String city;
public int getCusId() {
	return cusId;
}
public void setCusId(int cusId) {
	this.cusId = cusId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Customer(int cusId, String name, String city) {
	super();
	this.cusId = cusId;
	this.name = name;
	this.city = city;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [cusId=" + cusId + ", name=" + name + ", city=" + city + "]";
}



}