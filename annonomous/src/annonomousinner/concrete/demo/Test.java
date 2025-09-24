package annonomousinner.concrete.demo;

public class Test {
	public static void main(String[] args) {
		Printer pt=new Printer() {
			public void print() {
				System.out.println("Digital Colour Printing");
			}
		};
		pt.print();
	}

}
