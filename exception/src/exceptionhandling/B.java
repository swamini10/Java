package exceptionhandling;

public class B {
	public static void main(String[] args) {
		try{String a="ashish";
		int b=Integer.parseInt(a);
		
		System.out.println(b);
	}catch(Exception e) {
		System.out.println("cant convert");
	}
	}

}
