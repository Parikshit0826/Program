package Interview;

import java.util.Arrays;

public class interview3 {
	
//	first problem
	/*
	public static void main(String[] args) {
        int[] arr = {2, 4, 1, 2};
        int [] arr1 = {2,3,4};
        afterLastFour(arr);
        afterLastFour(arr1);
    }

    public static void afterLastFour(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
            }
        }

        if (index != -1 && index + 1 < arr.length) {
            int[] result = Arrays.copyOfRange(arr, index + 1, arr.length);
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("[]");
        }
    } */
    
    
//   second problem
    
	/*
    public static void main(String[] args) {
        String sentence = "welcome to chegus";
        swapCharacters(sentence);
    }

    public static void swapCharacters(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 1) {
                result.append(word);
            } else {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                result.append(last)
                      .append(word.substring(1, word.length() - 1))
                      .append(first);
            }
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }    
    */

	
//	third problem
	
	/*
	 public static void main(String[] args) {
	        closestTo21(19, 21);  // prints 21
	        closestTo21(1, 2);    // prints 2
	        closestTo21(16, 23);  // prints 16
	    }

	    public static void closestTo21(int a, int b) {
	        if (a > 21 && b > 21) {
	            System.out.println(0);
	        } else if (a > 21) {
	            System.out.println(b);
	        } else if (b > 21) {
	            System.out.println(a);
	        } else {
	            System.out.println(Math.max(a, b));
	        }
	    }
	    */
	
//	fourth problem
	
	 public static void main(String[] args) {
	        checkArmstrong(153);  // Yes
	        checkArmstrong(120);  // No
	    }

	    public static void checkArmstrong(int number) {
	        int original = number;
	        int result = 0;
	        int n = String.valueOf(number).length();

	        int temp = number;
	        while (temp > 0) {
	            int digit = temp % 10;
	            result += Math.pow(digit, n);
	            temp /= 10;
	        }

	        if (result == original) {
	            System.out.println("Input: " + original);
	            System.out.println("Output: Yes");
	            System.out.println("Explanation: " + original + " is an Armstrong number.");
	        } else {
	            System.out.println("Input: " + original);
	            System.out.println("Output: No");
	            System.out.println("Explanation: " + original + " is not an Armstrong number.");
	        }
	        System.out.println();
	    }
}
