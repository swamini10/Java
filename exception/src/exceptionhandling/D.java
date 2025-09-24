package exceptionhandling;

public class D {
	public static void main(String[] args) {
	try {	String a="Swapna";
		System.out.println(a.charAt(7));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("handled by child");
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("handled by parent");
	}
	catch (Exception e) {
		System.out.println("Handled by great parent");
	}
	}

}

//here the sequence that must be followed in order to handle exception without any error is as follows:
//StringOutOfBoundsException--->IndexOutOfBoundsException--->Exception--->Throwable

//Exception--->StringOutOfBoundsException(error)
//IndexOutOfBoundsException--->StringOutOfBoundException(error)
//Exception-->IndexOutOfBoundsException(error)
