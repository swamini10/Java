package annonomousinner.interfaces.demo;

public class Test {
	public static void main(String[] args) {
		Shape sh=new Shape() {
			public void draw() {
				System.out.println("draw  a circle");
			}
		};
		sh.draw();
	}

}
