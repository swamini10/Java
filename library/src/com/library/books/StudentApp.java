package com.library.books;

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
		}	
		}
	}


}
