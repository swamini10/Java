package Com.StringOperations;

public class B {
	public static void main(String[] args) {
		String a="Ashish";
		System.out.println(a+"Jadhav");
		System.out.println(a);
		
		String b="Soham";
		String m=" bhandare  ";
		String l="  ";
		String s="Swamini";
		System.out.println(s.charAt(1));               //return char at position 1
		System.out.println(s.codePointAt(0));           //ASCII Value
		System.out.println(s.codePointBefore(7));       //ASCII Value before given index
		System.out.println(s.codePointCount(1,5));      //count the no number bwt entered index
 		System.out.println(s.compareTo(b));              //method compares strings character by character using their ASCII Value
 		System.out.println(s.codePointBefore(7));       // ASCII (Unicode) code point before index 7 ('i')
 		System.out.println(s.length());                  // length of the string
 		System.out.println(s.charAt(3));                  // character at index 3 ('a')
 		System.out.println(s.compareTo(b));               // lexicographic comparison with b
 															//'S' == 'S' → continue
                                                            //'w' (ASCII 119) vs 'o' (ASCII 111) → difference = 119 - 111 = 8 (positive)
 		System.out.println(s.compareToIgnoreCase(b));     // lexicographic comparison ignoring case
 															//It compares "Swamini" and "Soham" ignoring case:
															//'S' vs 'S' → same
															//'w' vs 'o' → same as above → positive number (8)
															//But if s = "swamini" and b = "Soham", ignoring case means:
															//'s' vs 'S' → equal
															//'w' vs 'o' → difference = 8 → positive again															 																//
 		System.out.println(s.contains("win"));             // true if s contains substring "win"
 		System.out.println(s.endsWith("ni"));             // true if s ends with "ni"
 		System.out.println(s.startsWith("Swa"));          // true if s starts with "Swa"
 		System.out.println(s.indexOf('a'));                // index of first occurrence of 'a'
 		System.out.println(s.lastIndexOf('i'));            // index of last occurrence of 'i'
 		System.out.println(s.isEmpty());                    // true if s is empty
 		System.out.println(s.toUpperCase());                // s converted to uppercase
 		System.out.println(s.toLowerCase());                // s converted to lowercase
 		System.out.println(s.trim());                        // s without leading/trailing whitespace
 		System.out.println(s.replace('a', '@'));             // replace 'a' with '@'
 		System.out.println(s.substring(2));                  // substring from index 2 to end
 		System.out.println(s.substring(1, 4));               // substring from index 1 to 3
 		System.out.println(s.concat(b));                      // concatenates s and b
 		System.out.println(s.equals(b));                      // true if s equals b
 							// 		true if both strings have the same characters in the same order and same case.
                             //false otherwise.
 		System.out.println(s.equalsIgnoreCase(b));            // true if s equals b ignoring case
 		                                     //"Are these two strings the same if we don’t care about uppercase or lowercase letters?"
 		                                    //Only letters are case-insensitive — other characters like digits or symbols must match exactly.
 		System.out.println(s.repeat(3));                      // repeats string 3 times (
 	    System.out.println(m.strip());                        // removes leading and trailing whitespace 
 	    System.out.println(l.isBlank());                      // true if string is empty or only whitespace 
 	    
 	        
	}

}
