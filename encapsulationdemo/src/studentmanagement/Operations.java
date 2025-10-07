package studentmanagement;
import java.util.Scanner;

public class Operations {
	Scanner sc = new Scanner(System.in);
	
	Student stu = new Student();
	
	public void addStudent() {
		stu.setRollNo(22);
		stu.setName("Akash");
		stu.setCity("Pune");
		System.out.println("info Added");
	}
	
	public void getStudentInfo() {
		System.out.println(stu.getRollNo());
		System.out.println(stu.getName());
		System.out.println(stu.getCity());
	}
	
	
	public void updateStudent() {
		System.out.println("Enter RollNo");
		int RollNo = sc.nextInt();
		stu.setRollNo(RollNo);
		
		System.out.println("Enter name");
		stu.setName(sc.next());
		
		System.out.println("Enter City name");
		stu.setCity(sc.next());
	}
	
}
