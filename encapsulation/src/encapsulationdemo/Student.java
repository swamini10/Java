package encapsulationdemo;

public class Student {
	int rollno;
	String name;
	String address;
	String email;
	
	public static void main(String[] args) {
		Student st1=new Student();
		st1.rollno=74;
		st1.name="A";
		st1.address="B";
		st1.email="A@gmail.com";
		
		
		Student st2=new Student();
		st2.rollno=47;
		st2.name="B";
		st2.address="C";
		st2.email="B@gmail.com";
		
		Student st3=new Student();
		st3.rollno=51;
		st3.name="C";
		st3.address="D";
		st3.email="C@gmail.com";
		
	}

}
