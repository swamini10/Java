package annonomous.inner.demo;

public class Test {
	public static void main(String[] args) {
		Shape sh=new Shape() {
			public void draw() {
				System.out.println("draw Circle");
			}
		};
		sh.draw();
	}
	

}
