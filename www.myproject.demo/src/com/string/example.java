package com.string;
public class example {
		//enter abcdef then return the output as : bcdefa
		public static String changeSequence(String a) {
				return a.substring(1)+a.charAt(0);
		}
		public static String longeststring( String []arr) {		
			return null;
		}		
		public static int subStringIndex(String a, String b) {
	        if (a == null || b == null || b.length() > a.length()) {
				return -1;	
			}
			return a.indexOf(b);	
//			int m=a.indexOf(b);  return m; //using string function 
		}
		public static void main(String[] args) {
			String a="swamini";
			String b="swamini";
			System.out.println(example.changeSequence(a));
			System.out.println(example.longeststring(args));
			System.out.println(example.subStringIndex(a,b));
		}

	}