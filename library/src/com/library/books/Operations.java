package com.library.books;

import java.util.Scanner;


public class Operations {
	
	
	Scanner sc = new Scanner(System.in);
	private static Book bk = new Book();
	public void setBook() {
		System.out.println("Enter book name:");
		bk.setName(sc.next());
		
		
		System.out.println("Enter book author:");
		bk.setAuthor(sc.next());
		
		System.out.println("Enter book price:");
		bk.setPrice(sc.nextDouble());
		
		System.out.println("Enter book quantity:");
		int quantity = sc.nextInt();
		bk.setQuantity(quantity);
		
		bk.setRemaingStock(quantity);
	}
	public static void setRemaingStock(int i) {
		bk.setRemaingStock(bk.getRemaingStock()-1);
	}
	
					
	public void getBook() {
		System.out.println(bk.getName());
		System.out.println(bk.getAuthor());
		System.out.println(bk.getPrice());
		System.out.println(bk.getQuantity());
		System.out.println(bk.getRemaingStock());

	}
	public static void main(String[] args) {
		Operations Op=new Operations();
		Op.setBook();
		Op.getBook();
		

	}

}
