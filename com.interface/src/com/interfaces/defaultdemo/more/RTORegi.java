package com.interfaces.defaultdemo.more;

public interface RTORegi extends CarCompany {
	default void getFuelType() {
		System.out.println("CNG");
	}


}
