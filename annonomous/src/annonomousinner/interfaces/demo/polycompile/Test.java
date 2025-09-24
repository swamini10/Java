package annonomousinner.interfaces.demo.polycompile;

public class Test {
	public static void main(String[] args) {
		Shape sh=new Shape() {
			public void draw(String a) {
				System.out.println("draw circle");
			}
			public void draw(int a,String b) {
				System.out.println("draw the given no circle");
			}
			public void draw(int a,int b,int c) {
				System.out.println("draw three circle");
			}
		
		};
		
		sh.draw("Circle");
		sh.draw(1,"Circle");
		sh.draw(1,2,3);
	}

}
