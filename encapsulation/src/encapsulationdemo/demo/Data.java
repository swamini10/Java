package encapsulationdemo.demo;
import java.util.Scanner;

public class Data {
	Employee emp=new Employee();
	Scanner sc=new Scanner(System.in);
	
	public void setData() {
		
		System.out.println("Enter EmpId");
		int empId=sc.nextInt();
	    emp.setEmpId(empId);
	    
	    System.out.println("Enter Name");
	    String name=sc.next();
	    emp.setName(name);
	    
	    System.out.println("Enter City");
	    String city=sc.next();
	    emp.setCity(city);
	
		
	}
	
	public void getData() {
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getCity());
		
	}
	
	


}
