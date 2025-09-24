package encapsulationdemo.demo.two;

public class Test {
	public static void main(String[] args) {
		Student st=new Student();
		st.setName("Ashish");
		st.setRollno(123);
		st.setCity("Pune");
		
		
		Student st1=new Student();
		st.setName("Omkar");
		st.setRollno(456);
		st.setCity("Mumbai");
		
		System.out.println(st);
		System.out.println(st1);
		
		
		Student st3=new Student(100,"Swapnil","Indapur");
		System.out.println(st3.getRollno());
		System.out.println(st3.getName());
		System.out.println(st3.getCity());
		
		System.out.println(st3);
	}

}
