package studentmanagement;

public class Student {
	private int rollno;
	 private String name;
  private String course;
  private String city;
  
  
  public void setRollno(int rollno) {
	  this.rollno=rollno;
  }
  
  public void setName(String name) {
	  this.name=name;
  }
  public void setCourse(String course ) {
	  this.course=course;
  }
  
  public void setCity(String city) {
	  this.city=city;
  }
  
  public int getRollno() {
	  return rollno;
  }
  
  public String getName() {
	  return name;
  }
  
  public String getCourse() {
	  return course;
	  
  }
  
  public String getCity() {
	  return city;
  }
	
	

}
