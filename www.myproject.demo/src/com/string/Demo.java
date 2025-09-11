package com.string;

public class Demo {

	    // Example: "abcdef" -> "bcdefa"
	    // This method takes a string and moves its first character to the end.
	    public static String changeSequence(String a) {
//	        if (a == null || a.length() <= 1) {
//	            return a;
//	        }
//	        return a.substring(1) + a.charAt(0);
	    	//we use for loop Also
	    	for(int i=0;i<a.length();i++) {
				return a.substring(1)+a.charAt(0);
	    	}	
	    	return a;
	    }
	    
	    // Example: {"flower", "fly", "flow", "flight"} -> "fl"
	    // This method finds the longest common prefix among an array of strings.
	    public static String longestString(String[] arr) {
	        if (arr == null || arr.length == 0) {
	            return "";
	        }
	        
	        String prefix = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            while (arr[i].indexOf(prefix) != 0) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                if (prefix.isEmpty()) {
	                    return "";
	                }
	            }
	        }
	        return prefix;
	    }

	    // Example: a="leetcode" b="leet" -> 1
	    // Example: a="football" b="ball" -> 4
	    // This method finds the starting index of the first occurrence of string 'b' in string 'a'.
	    public int subStringIndex(String a, String b) {
	        if (a == null || b == null || b.length() > a.length()) {
	            return -1; // Or some other value indicating no match
	        }
	        return a.indexOf(b);
	    }
	    
	    public static void main(String[] args) {
	        // --- Examples for changeSequence ---
	        String a1 = "abcdef";
	        System.out.println("changeSequence(\"" + a1 + "\") -> " + Demo.changeSequence(a1)); // Expected: bcdefa
	        
	        String a2 = "opqrst";
	        System.out.println("changeSequence(\"" + a2 + "\") -> " + Demo.changeSequence(a2)); // Expected: pqrsto
	        
	        String a3 = "uvwxyz";
	        System.out.println("changeSequence(\"" + a3 + "\") -> " + Demo.changeSequence(a3)); // Expected: vwxyzu

	        // --- Examples for longestString ---
	        String[] ab1 = {"flower", "fly", "flow", "flight"};
	        System.out.println("\nlongestString({\"flower\", \"fly\", \"flow\", \"flight\"}) -> " + Demo.longestString(ab1)); // Expected: fl

	        // --- Examples for subStringIndex ---
	        Demo e = new Demo(); // An instance is needed because subStringIndex is not static
	        String a_sub1 = "leetcode";
	        String b_sub1 = "leet";
	        System.out.println("\nsubStringIndex(\"" + a_sub1 + "\", \"" + b_sub1 + "\") -> " + e.subStringIndex(a_sub1, b_sub1)); // Expected: 1
	        
	        String a_sub2 = "football";
	        String b_sub2 = "ball";
	        System.out.println("subStringIndex(\"" + a_sub2 + "\", \"" + b_sub2 + "\") -> " + e.subStringIndex(a_sub2, b_sub2)); // Expected: 4
	    }
	}
