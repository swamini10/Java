package studentmanagement;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Operations op=new Operations();
	op.addStudent();
	op.getStudentInfo();
	boolean start=true;
	while(start) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Press 1 for add Student\nPress 2 to see student details\nPress 3 to update student details");
	int ch=sc.nextInt();
	
	switch(ch) {
	case 1:
		op.addStudent();
		break;
		
	case 2:
		op.getStudentInfo();
		break;
		
	case 3:
		op.updateStudent();
		
	
	}
	}
}
}
	



