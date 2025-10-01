package exceptionhandling.finallyblock;

public class B {
	
	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		}catch(Exception e) {
			System.out.println("exception handled");
		}
	}

}

//throw is  a keyword which is use to throw exception intensionally during maintenance