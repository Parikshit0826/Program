package user;

import String.UniqueChars;

public class UniqueChars_Test {

//	 public static void main(String[] args) {
//		 //1. 
//		 	String input = "welcometoaccolite";
//	        System.out.println("Output: " + UniqueChars.firstNonRepeatingIndex(input)); // Expected Output: 0	    
//	     //2.	       
//	        System.out.println("Output: " + UniqueChars.firstNonRepeatingIndex("mhgxjamnbas"));	     
//	    //3. 
//	        System.out.println("Output: " + UniqueChars.firstNonRepeatingIndex(null));	     
//	    //4.
//	        System.out.println("Output: " + UniqueChars.firstNonRepeatingIndex(""));	        
//	    //5.
//	        System.out.println("Output: " + UniqueChars.firstNonRepeatingIndex("msakjhsjhbcx"));
//	        
//	        
//	 
//	 }
	
	  public static void main(String[] args) {
	        test("welcometoaccolite", 0);
	        test("aabbcc", -1);
	        test("aabbc", 4);
	        test("abcabcdd", -1);
	        test("acbdbae", 1);
	        test("z", 0);
	        test("", -1); // edge case: empty string
	        test(null, -1); // edge case: null string
	    }

	    private static void test(String input, int expected) {
	        int result = UniqueChars.firstNonRepeatingIndex(input);
	        if (result == expected) {
	            System.out.println("PASS: Input = \"" + input + "\" | Expected = " + expected + " | Got = " + result);
	        } else {
	            System.out.println("FAIL: Input = \"" + input + "\" | Expected = " + expected + " | Got = " + result);
	        }
	    }
}




















