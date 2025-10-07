package com.stringoperations;

public class G {
	public static String changeSequence(String a) {
		String op="";
		for(int i=1;i<a.length();i++) {
			op+=a.charAt(i);
			
		}
		
		op+=a.charAt(0);
		
		return op;
		
	}
	
	public static int subStringIndex(String a, String b) {
		for (int i=0;i<a.length();i++) {
			int j;
			for(j=0;j<b.length();j++) {
				if(a.charAt(i)!=b.charAt(j)) {
					break;
				}
				
			}
			if(j==b.length()) {
				return i;
			}
			
			
		}
	return -1;
	}
	
	
	public static void main(String[] args) {
		String sp="opqrst";
		System.out.println(G.changeSequence(sp));
		
		String a="basket";
		String b="fruitbasket";
		System.out.println(subStringIndex(a,b));
		
		
	
		

		
	}	
}
