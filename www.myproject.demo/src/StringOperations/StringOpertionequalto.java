package Com.StringOperations;

public class StringOpertionequalto {
	public static void main(String[] args) {
	
	String a="swamini";
	String b="swamini";
	
	String c = new String("swamini");
	String d = new String("swamini");
	
	
	System.out.println(a.equals(b));//true(same content)
	System.out.println(a==b);//true(same memory)
	
	System.out.println(a.equals(c));//true(same content)
	System.out.println(a==c);//false(different memory)
}
}