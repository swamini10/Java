package encapsulationdemo.demo;

public class App {
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpId(7382);//using local variable the private variables are accessed here
		emp.setName("Ashish");
		emp.setCity("Indapur");
		emp.setHasAdhar(true);
		
		
		System.out.println(emp.getEmpId());
		
		System.out.println(emp.getName());
		
		System.out.println(emp.getCity());
		
		System.out.println(emp.getHasAdhar());
		System.out.println("----------------------");
		
		Employee emp1=new Employee();
		emp.setEmpId(6382);
		emp.setName("Swapnil");
		emp.setCity("Indapur");
		emp.setHasAdhar(false);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getCity());
		System.out.println(emp.getHasAdhar());
		
	}

}
