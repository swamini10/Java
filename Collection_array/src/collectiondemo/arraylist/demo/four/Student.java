package collectiondemo.arraylist.demo.four;

public class Student {
	String username;
	int password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "student [username=" + username + ", password=" + password + "]";
	}
	public Student(String username, int password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
