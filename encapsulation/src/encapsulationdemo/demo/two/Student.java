package encapsulationdemo.demo.two;



	public class Student {
		private int rollno;
		private String name;
		private String city;
		
		
		public Student(int rollno, String name, String city) {
			this.rollno=rollno;
			this.name=name;
			this.city=city;
		} //parametrized constructor use kela aahe
		
		Student(){
			
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public void setRollno(int rollno) {
			this.rollno=rollno;
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
		
		public String getCity() {
			return city;
		}
		
		public String toString() {
			return "Student[name:"+name+"rollno:"+rollno+"city:"+city+"]";
		} //object function use krun overriding keli aahe

	}


