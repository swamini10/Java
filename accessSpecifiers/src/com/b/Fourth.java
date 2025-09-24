package com.b;

import com.a.First;

public class Fourth extends First{
	public static void main(String[] args) {
	//	First fs=new First();  error show krnar 
	//	System.out.println(fs.pro);
		Fourth ft=new Fourth();  //child ch object create kel
		System.out.println(ft.pro);  ///object use krun access specifier another package madhe call kela.
		
		First fs =new First();
		//System.out.println(fs.pvt);
		//System.out.println(fs.def);
		System.out.println(fs.pub); //phakt public access honar all over the project baki error show krnar
		//System.out.println(fs.pro);
	}

}
