package annonomousinner.interfaces.demo.more;

public interface Car {
public void getName();
	
	public static void getColour() {
		System.out.println(" red");
	}//static function annonymous madhe call nahi hot..it belongs to its particular class or interface
	default void getAvg() {
		System.out.println("10km/hr");
	}

}
