package com.library.books;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class StudentOp {
	Student st =new Student();
	Scanner sc = new Scanner (System.in);
     int TotalStock=10;
     
public void issueBook() {
		System.out.println("enter id");
		st.setId(sc.nextInt());
		
		System.out.println("enter name");
		st.setName(sc.next());
		
		System.out.println("enter city");
		st.setCity(sc.next());
		
		st.setIssueDate(LocalDate.now());
		
		System.out.println("Book issued......");
		
		st.setNoBookIssued(st.getNoBookIssued()+1);
		
	Operations op =new Operations();
	op.setRemaingStock(1);
	}

public void SubmitBook() {
	
	System.out.println("Enter Student Id:");
	if(sc.nextInt() == st.getId()) {
		st.setSubmitBook(LocalDate.now());
		long days = ChronoUnit.DAYS.between(st.getIssueDate() ,LocalDate.now());

		if(days<7) {
			System.out.println("0 fine for this book");
		}else {
			int fineDays = (int) (days-7);
			int fine = fineDays *2;
			st.setTotalFine(st.getTotalFine()+fine);
	
		}
		System.out.println("Book submitted.......");
	
	}else {
		System.out.println("invalid ID");
	}
	
	
	
}

public static void main(String[] args) {
	StudentOp st1=new StudentOp();
	st1.issueBook();
	st1.SubmitBook();
	
}

}


