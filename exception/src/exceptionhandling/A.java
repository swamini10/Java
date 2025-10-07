package exceptionhandling;

public class A {
	public static void main(String[] args) {
		try{int a=0;
		int b=0;
		System.out.println(a/b);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Result is undefined");
		}catch(NullPointerException e) {
			System.out.println("Handled 1");
		}catch(ArithmeticException e) {
			System.out.println("Handled 2");
		}catch(Exception e) {
			System.out.println("Handled 3");
		}
		
	}

}
//inbetween try and catch block no other line of code can be involvd
// single try can have multiple catch block

//if at first catch block exception is matched it will not check another block.


