package encapsulation.demo.first;

public class Student {
	int rollno;
	String name;
	
	public static void main(String[] args) {
		Student st=new Student();
		st.rollno=111;
		st.name="ABC";
		
		Student st1=new Student();
		st1.rollno=555;
		st1.name="CDE";
		
		st.rollno=999; //value of roll no here gets changed
		System.out.println(st.rollno);
		System.out.println(st1.name);
		System.out.println(st.name);
		System.out.println(st1.rollno);
		
	}

}
