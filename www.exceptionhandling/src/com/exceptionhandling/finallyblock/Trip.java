package com.exceptionhandling.finallyblock;

public class Trip {
	public static void main(String[] args) {
		try {
			System.out.println("swamini go to Trip");
		boolean SheIsSick =true;
		if (SheIsSick) {
			throw new illnessException();
		}else {
			System.out.println("Enjoy trip");
		}
	}finally {
		System.out.println("Come to home");
	}
}
}


//After try block is use directly catch block
//finally block run anyway if exception is occurs or not this block execute