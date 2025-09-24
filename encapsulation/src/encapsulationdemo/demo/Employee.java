package encapsulationdemo.demo;

public class Employee {
	private int empId; //we have set global variable as private so as to access them within class only
	private String name;
	private String city;
	private boolean hasAdhar;
	
	
	public void setHasAdhar(boolean hasAdhar) {
		this.hasAdhar=hasAdhar;
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
		
	}
	public void setName(String name) {
		this.name=name;
	}//here the global variable is access through local variable using this keyword
	public void setCity(String city) {
		this.city=city;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
		
	}
	
	public String getCity() {
		return city;
	}
	
	public boolean getHasAdhar() {
		return hasAdhar;
	}
	

}
