package com.interfaces.defaultdemo.more;

public interface CarCompany {
	default void getFuelType() {
		System.out.println("Petrol");
	}

}
