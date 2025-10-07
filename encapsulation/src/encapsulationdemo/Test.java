package encapsulationdemo;

public class Test {
	Employee emp=new Employee();
	Employee emp1=new Employee();
	
public void setData() {
		
		emp.empId=111;
		emp.name="Ashish";
		emp.address="abc";
		
		emp1.empId=999;
		emp1.name="abcs";
		emp1.address="xyz";
		
		System.out.println("Data Inserted");
		
		
	}
	
	public void getData() {
		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.address);
		
		
		System.out.println(emp1.empId);
		System.out.println(emp1.name);
		System.out.println(emp1.address);
	}

}
