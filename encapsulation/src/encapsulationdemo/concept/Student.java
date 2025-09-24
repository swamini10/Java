package encapsulationdemo.concept;

public class Student {
	int rollNo;
	String name;
	String city;
	
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;//this keyword is used to access global variable through local variable
	}
	
	public void setName(String name) {
		this.name=name;
	}

}
