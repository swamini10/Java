package exceptionhandling.finallyblock;

public class A {
	public static void main(String[] args) {
		try{int a=10;
		//int b=0;
		int b=10;
		
	
		System.out.println(a/b);
         
		}catch(ArithmeticException e) {
			System.out.println("Inside catch");
		}finally {
			System.out.println("Inside finally");
		}

	}

}
//no matter whether there is an exception or not finally block will always run.
//catch block will only run only if there is an exception.