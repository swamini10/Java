package exceptionhandling.finallyblock;
import java.util.Scanner;

import exceptionhandling.custom.AgeNotValidException;
public class C {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Canditates name:");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		
		if(age>18) {
			System.out.println("Voter Registered Successfully");
		}else {
			throw new AgeNotValidException();
		}
	}

}
