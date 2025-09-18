package com.encapsulationdemo.demo;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Data db = new Data();
		boolean start = true;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 1 for setData and 2 for getData");
			int ch = sc.nextInt();
			
			switch(ch) {
			 case 1: 
				db.setData();
				break; 
				
			 case 2: 
				 db.getData();
				 break;
				 
			 case 3:
				 start = false;
				 break;
			 }
		
		}
			
	}
		
		

}
