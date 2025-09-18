package studentmanagement;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Operations op = new Operations();
//        boolean start = true;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 1 for addStudent and 2 for StudentInfo and 3 for Update");
			int ch = sc.nextInt();
			
			switch(ch) {
			 case 1: 
				op.addStudent();
				break; 
				
			 case 2: 
				 op.getStudentInfo();
				 break;
				 
			 case 3:
				 op.updateStudent();				 
				 break;
			 }
		
		}
	}
}
