package collectiondemo.arraylist;
import java.util.ArrayList;
import java.util.List;
public class App {

	public void setAllStudents() {
	List<Student>students =new ArrayList<>();
	Student st=new Student();
		st.setName("Ashish");
		st.setRollNo(10);
		st.setCity("pune");
		
		Student st1=new Student();
		st1.setName("Sohan");
		st1.setRollNo(07);
		st1.setCity("pune");
		
		students.add(st1);
		
		System.out.println(students);
		System.out.println(students.add(st1));

  }

	public static void main(String[] args) {
		
		App app=new App();
		app.setAllStudents();
	}
}