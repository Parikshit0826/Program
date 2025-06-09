package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueChars {
	/*
	 public static int firstNonRepeatingIndex(String target) {
	
		 // Edge case check
	        if (target == null || target.length() == 0 || target.length() >= 1000) return -1;
	        // Store frequency of each character
	        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
	        for (char c : target.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }
	        // Find first non-repeating character
	        for (int i = 0; i < target.length(); i++) {
	            if (frequencyMap.get(target.charAt(i)) == 1) {
	                return i;
	            }
	        }
	        // If all characters are repeating
	        return -1;
	    }
	    // Main method for quick local testing
	    public static void main(String[] args) {
	    	String input = "welcometoaccolite";
	        System.out.println("Output: " + firstNonRepeatingIndex(input)); 
	    }
	    
	    */	
	 public static int firstNonRepeatingIndex(String target) {
	 // Explicitly check string length constraint
	        if (target == null || target.length() < 1 || target.length() >= 1000) {
	            return -1;
	        }
	 // Store frequency of each character
	        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
	        for (char c : target.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }
	// Find first non-repeating character
	        for (int i = 0; i < target.length(); i++) {
	            if (frequencyMap.get(target.charAt(i)) == 1) {
	                return i;
	            }
	        }

	 // If all characters are repeating
	        return -1;
	    }

	    public static void main(String[] args) {
	 // Sample input tests
	        System.out.println(firstNonRepeatingIndex("welcometoaccolite")); // Output: 0
	        System.out.println(firstNonRepeatingIndex("aabbcc"));            // Output: -1
	        System.out.println(firstNonRepeatingIndex(""));                  // Output: -1 (invalid length)
	        System.out.println(firstNonRepeatingIndex(null));               // Output: -1 (null check)
	    }

}
