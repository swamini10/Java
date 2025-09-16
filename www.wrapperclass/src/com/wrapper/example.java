package com.wrapper;

public class example {

	    /**
	     * If the input string has any digit:
	     *   - convert all letters to uppercase
	     *   - replace each digit with '_'
	     * Otherwise:
	     *   - just convert the entire string to uppercase
	     *
	     * str input string
	     * return processed string
	     */
	    public static String getString(String str) {
	        // First, check if there's any digit in the string
	        boolean Digit = false;
	        for (int i = 0; i < str.length(); i++) {
	            if (Character.isDigit(str.charAt(i))) {
	                Digit = true;
	                break;
	            }
	        }

	        if (Digit) {
	            // Replace digits with '_' and uppercase the letters
	            StringBuilder sb = new StringBuilder();
	            for (int i = 0; i < str.length(); i++) {
	                char c = str.charAt(i);
	                if (Character.isDigit(c)) {
	                    sb.append('_');
	                } else {
	                    sb.append(Character.toUpperCase(c));
	                }
	            }
	            return sb.toString();
	        } else {
	            // No digits: just uppercase the string
	            return str.toUpperCase();
	        }
	    }

	    public static void main(String[] args) {
	        String s1 = "Swamini";
	        String s2 = "SwAmini123";

	        System.out.println(getString(s1));   // expected: SWAMINI
	        System.out.println(getString(s2));   // expected: SWAMINI___
	    }
	}
