package com.a;

public class First {
	private String ptv = "Private Access";
	String def = "Default Access";
	public String pub = "Public Access";
	protected String pro = "Protected Access";
	
	public static void main(String[] args) {
		First fs = new First();
		System.out.println(fs.ptv);   // private access within the class only
		System.out.println(fs.def);   // default access in the same package
		System.out.println(fs.pub);  // public access all the Project
		System.out.println(fs.pro);
	}

}
