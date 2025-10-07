package studentmanagement;
import java.util.Scanner;

public class Operations {
	
	Student st=new Student();
	Scanner sc=new Scanner(System.in);
	
	public void addStudent() {
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		st.setRollno(rollno);
		
		System.out.println("Enter Name");
		String name=sc.next();
		st.setName(name);
		
		System.out.println("Enter Course");
		String course=sc.next();
		st.setCourse(course);
		
		System.out.println("Enter City");
		String city=sc.next();
		st.setCity(city);
		
		
	
	}
	
	public void getStudentInfo() {
		System.out.println(st.getRollno());
		System.out.println(st.getName());
		System.out.println(st.getCourse());
		System.out.println(st.getCity());
		
	
	}
	
	public void updateStudent() {
		
		System.out.println("Enter new rollno:");
		st.setRollno(sc.nextInt());
		System.out.println("Enter new name:");
		st.setName(sc.next());
		System.out.println("Enter new Course:");
		st.setCourse(sc.next());
		System.out.println("Enter new City");
		st.setCity(sc.next());
	}
}
