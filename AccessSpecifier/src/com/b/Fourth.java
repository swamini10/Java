package com.b;

import com.a.First;

public class Fourth extends First { //class Extends to Parent class of the another package
	public static void main(String[] args) {
		Fourth fr = new Fourth();      // create the obj of the child class To execute the protected in the another package
//		System.out.println(fs.ptv);
//		System.out.println(fs.def);
		System.out.println(fr.pub);
		System.out.println(fr.pro);
	}
}
// we can access the protected member by using the child class obj in the another package