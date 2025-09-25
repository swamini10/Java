package com.library.books;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		System.out.println("press 1 for issue book\n press 2 for submit book ");
		StudentOp stu =new StudentOp();
		BookApp bp= new BookApp();
		boolean start=true;
		while (start) {
		System.out.println("enter number");
		Scanner  sc = new Scanner(System.in);
		int ch=sc.nextInt();
		try{
		switch(ch) {
		case 1:
			stu.issueBook();

	    	break;
		case 2:
			stu.SubmitBook();
			break;	
		case 3:
			start=false;
			break;
		}} catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input! ");
                sc.nextLine(); // clear invalid input
            } catch (Exception e) {
                System.out.println("⚠️ Unexpected error: " + e.getMessage());
            }	
		}
	}


}
