package exceptionhandling.custom;

public class Test {
  public static void getCollege() {
	 try { throw new CollegeNotFound();
	 }catch(CollegeNotFound e) {
		 System.out.println("Handled");
	 }
	 
  }
  
  public static void main(String[] args) {
	Test.getCollege();
}

}
