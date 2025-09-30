package collectiondemo.arraylist.demo.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import collectiondemo.arraylist.demo.three.Student;

public class App {
	Scanner sc=new Scanner(System.in);
	List<Student>student =new ArrayList<>();
	public void setAllStudents() {
		Boolean addMore =true;
		while(addMore) {
			System.out.println("enter roll no :");
			int rollno=sc.nextInt();
			System.out.println("enter name :");
			String name=sc.next();
			System.out.println("enter city :");
			String city=sc.next();
			System.out.println("enter contact :");
			long contact=sc.nextLong();
					
					
			Student st =new Student(rollno,name,city,contact);
			student.add(st);
			System.out.println("press 1 for add more");
			if(1!=sc.nextInt()) {
				 addMore =false;
			}
		}
		
	}
	public void getAllStudents() {
		Iterator<Student> itr=student.iterator();
		while(itr.hasNext()) {
			Student st =itr.next();
			System.out.println(st.getRollno());
			System.out.println(st.getName());
			System.out.println(st.getCity());
			System.out.println(st.getContact());
			
		}
	}
}
