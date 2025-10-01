package collectiondemo.arraylist.demo.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import collectiondemo.arraylist.demo.four.Student;

public class App {
	
		List<Student>student =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		public void setuser() {
			Boolean addMore =true;
			while(addMore) {
				System.out.println("enter username :");
				String username=sc.next();
				System.out.println("enter password :");
				int password=sc.nextInt();
				
						
				Student st =new Student(username,password);
				student.add(st);
				System.out.println("press 1 for add more");
				if(1!=sc.nextInt()) {
					 addMore =false;
				}
			}
	}
		public void getuser() {
			Iterator<Student> itr=student.iterator();
			while(itr.hasNext()) {
				Student st =itr.next();
				System.out.println(st.getUsername());
				System.out.println(st.getPassword());
				
			}
		}
     public static boolean LoginUser() {
	return true;
}
}
