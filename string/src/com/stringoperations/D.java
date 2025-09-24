package com.stringoperations;

public class D {
	public static void main(String[] args) {
		String a ="Mumbai";
		String b="Mumbai";
		
		String c=new String ("Mumbai");
		
		String e="Pune";
		String f=new String("Pune");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));//this both will return same output as boths content and memory location is same in scp
		
		System.out.println(a==c);
		System.out.println(a.equals(c));//this both will return different o/p as memory loaction is different yet content are same
		
		//difference between .equals() & == is
		//.equals() function checks the content of the two string to be compared
		//whereas the == checks the memory location of two string in scp 
	}

}
