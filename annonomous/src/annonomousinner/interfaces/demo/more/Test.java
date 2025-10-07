package annonomousinner.interfaces.demo.more;

public class Test {
	public static void main(String[] args) {
		Car cr=new Car() {
			public void getName() {
				System.out.println("Safari");
			}
			
		
		
			
		};
		
		cr.getName();
		cr.getAvg();
		Car.getColour();
		
	}

}
