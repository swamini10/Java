package exceptionhandling;

public class Demo {
	public static void main (String[]args) {
		try{int a=10;
		int b=0;
		System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Handled by parent");
		}
		
		//here if parent is taken at first it will handle all excetion of its child also...if after parent child is used then it 
		//will throw an error.
	
//Hence always use parent at last and child in the beginning 		
		
//		catch(RuntimeException e) {
//			System.out.println(Handled by child);
//		}
//		
//		catch(ArithmeticException e) {
//			System.out.println(Handled by child);
//		}
		
		
		
		
	}

}
