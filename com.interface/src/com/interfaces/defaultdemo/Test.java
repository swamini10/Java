package com.interfaces.defaultdemo;

public class Test {
	public static void main(String[] args) {
		Car sf= new Safari();
		sf.getName();
		Car.getFeatures();
		sf.getFuelType();//in this way default function is directly called
	}

}
