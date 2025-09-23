package com.exceptionhandling.throww;
import java.util.*;
import com.exceptionhandling.custom.AgeNotvalidException;
public class C {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter candidate name");
		String name =sc.next();
		System.out.println("enter age");
		int age =sc.nextInt();
		if (age>18) {
			System.out.println("votter register.....");
		}else {
			throw new AgeNotvalidException();
		}
	}

}
