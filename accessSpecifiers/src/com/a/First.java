package com.a;

public class First {
	private String pvt="private access";
	String def="default access";
	public String pub="public access";
	protected String pro="protected access";
	
	
	public static void main(String[] args) {
		First fs =new First();
		System.out.println(fs.pvt);
		System.out.println(fs.def);
		System.out.println(fs.pub);
		System.out.println(fs.pro);
	}

}
