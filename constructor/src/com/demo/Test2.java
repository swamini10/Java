package com.demo;

public class Test2 extends Test {
	    public Test2() {
	        System.out.println("inside test constructor");
	    }
	    public void m2() {
	        System.out.println("hello");
	    }
	    public static void main(String[] args) {
	        Test2 t = new Test2(); 
	        t.m2();               
	    }
	}
// inhert property so both constructor will call