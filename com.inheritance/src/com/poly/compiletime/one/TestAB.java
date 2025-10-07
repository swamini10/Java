package com.poly.compiletime.one;

public class TestAB {
	public static void main(String[] args) {
		A.m1();
		B.m1();//static function madhe overriding is not possible because parent chi property child override nahi krt
	}

}
