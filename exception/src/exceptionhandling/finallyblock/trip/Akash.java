package exceptionhandling.finallyblock.trip;


public class Akash {
	public static void main(String[] args) {
		try{System.out.println("Akash go to trip");
		boolean heIsSick=true;
		if(!heIsSick) {
			throw new IllnessException();
			
		}else {
			System.out.println("Enjoy Trip");
		}
		}finally {
			System.out.println("Come to home");
		}
	}
}
