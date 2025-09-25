package collectiondemo.arraylist;

public class App {
	Student st=new Student();
	public void setAllStudents() {
		
		st.name="Ashish";
		st.rollNo=10;
		st.city="pune";
	}
	public void getAllStudents() {
		System.out.println(st.name);
		System.out.println(st.rollNo);
		System.out.println(st.city);
	}
}
