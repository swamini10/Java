package com.stringoperations;

public class C {
public static void main(String[] args) {
	String name="Elephantis";
	String play="Buffalo";
	System.out.println(name.charAt(4));
	System.out.println(name.codePointAt(5));
	System.out.println(name.codePointBefore(5));
	System.out.println(name.concat("good"));
	System.out.println(name.contains("phan"));
	System.out.println(name.indent(3));//adjust indentation of every line in string
	System.out.println(name.intern()==play.intern());//checks whether the two different string given are already present in the pool or not
	System.out.println(name.indexOf('i'));
	System.out.println(name.isEmpty());
	System.out.println(name.length());
	System.out.println(name.replace('e','s'));
	System.out.println(play.toLowerCase());
	
}
}
