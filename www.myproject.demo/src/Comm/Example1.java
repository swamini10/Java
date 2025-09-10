package Comm;

public class Example1 {
	public static void main(String[] args) {
		String s="ABCDEF";
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			a+=s.charAt(i);
	   }
		System.out.println(a);
	}
}
