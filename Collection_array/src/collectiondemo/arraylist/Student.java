package collectiondemo.arraylist;

public class Student {
	 String name;
	 int rollNo;
	 String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Student() {
		 
    }
	public Student(String name,int rollNo,String city) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
    }
	
}
