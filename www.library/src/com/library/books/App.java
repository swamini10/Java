package com.library.books;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 for issue bookApp\n press 2 for studentOp ");
		StudentOp stu =new StudentOp();
		Operations Op =new Operations();

		boolean start=true;
		while (start) {
		System.out.println("enter number");
		Scanner  sc = new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Op.setBook();
	    	break;
		case 2:
			Op.getBook();
			break;	
		case 3:
			stu.issueBook();
		case 4:
			stu.SubmitBook();
		case 5:
			start=false;
			break;
		}	
		}
	}

}
