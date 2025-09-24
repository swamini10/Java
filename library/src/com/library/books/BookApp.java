package com.library.books;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		System.out.println("press 1 for set book\n press 2 for see get book info");
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
			start=false;
			break;
		}	
		}
	}

}


