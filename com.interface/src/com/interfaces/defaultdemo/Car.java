package com.interfaces.defaultdemo;

public interface Car {
	public void getName();
	
	public static void getFeatures() {
		System.out.println("5 star safety");
	}
	default void getFuelType() {
		System.out.println("Petrol");
	}

}
