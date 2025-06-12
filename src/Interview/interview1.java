package Interview;


import java.util.Arrays;
import java.util.Iterator;

public class interview1 {

	//1. find the perfrct square
	
//	static void sqroot(int num) {
//		 
//		int a = (int) Math.sqrt(num);
//		double b = Math.sqrt(num);
//		
//		if(a==b) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}		
//	}
//	
//	public static void main(String[] args) {
//		
//		sqroot(25);
//		sqroot(36);
//		sqroot(12);
//		sqroot(100);
//		sqroot(125);
//		
//	}
	
	
	//==========================================================================================
	
	//2. smallest and largest number in the array
	
//	public static void main(String[] args) {
//		
//		int [] arr = {10, 25, 6, 100, 50, 4};
//		int small=arr[0];
//		int large = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(arr[i]<small ) {
//				small = arr[i];			
//			}
//			else if(arr[i]>large ) {
//				large = arr[i];				
//			}
//			
//		}
//		
//		System.out.println(small +" is the smallest value");
//		
//		System.out.println(large +" is the largest value");
//		
//		
//		
//	}
	
	//===================================================================================
	
	
//	3. swap first and last word in a sentence
	
//	public static void main(String[] args) {
//		
//		String str = "Hello my name is Parikshit";
//		String [] arr = str.split(" ");
//		String first = arr[0];
//		String last= arr[arr.length-1];
//		String mid = " ";
//		for (int i = 1; i < arr.length-1; i++) {
//			mid = mid+ arr[i]+" ";
//			
//		}
//		System.out.println(last+ mid + first);
//	}
	
	//===========================================================================
	
	// 4.    if any value is 13 then return the previous sum
	
//	static void sum(int a, int b, int c) {
//		if(a==13) {
//			System.out.println(0);
//		}
//		else if(b==13) {
//			System.out.println(a);
//		}
//		else if(c ==13) {
//			System.out.println(a+b);
//		}
//		else {
//			System.out.println(a+b+c);
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		sum(1,2,3);
//		sum(13,2,13);
//		sum(3,3,13);
//		
//	}
//
	
	//============================================================================================
	
//	4. sum of only unique value
	
//	static void sumUnique(int a , int b, int c) {
//		
//		if(a==b &&b==c) {
//			System.out.println(0);
//		}
//		else if(a==c) {
//			System.out.println(b);
//		}
//		else if(b==c) {
//			System.out.println(a);
//		}
//		else if(b==a) {
//			System.out.println(c);
//		}
//		else {
//			System.out.println(a+b+c);
//		}
//	
//	}
//	public static void main(String[] args) {
//		sumUnique(1, 2, 3);
//		sumUnique(3, 2, 3);
//		sumUnique(3, 3, 3);
//	}
	
	
	//============================================================================================
	
	
//	4.  repeat the String as shown
	
	
	
//	static void two(String str) {
//		
//		String str1 ="";
//		for (int i = 0; i < str.length(); i++) {
//			str1+= str.charAt(i)+""+str.charAt(i);
//			
//		}
//		System.out.println(str1);
//		
//	}
//	public static void main(String[] args) {
//		two("The");
//		two("AAbb");
//		two("Hi--There");
//	}
//	
	
	//======================================================
//	6.  multipe of 3 and 5
	
//	static void multiple(int a)
//	{
//		if(a%3==0 && a%5==0 ) {
//			System.out.println("false");
//			
//		}
//		else if(a%3==0) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("true");
//			
//		}
//	}
//	public static void main(String[] args) {
//		multiple(30);
//		multiple(65);
//		multiple(15);
//		multiple(45);
//		
//	}
	
	//===============================================================
	
//	7. 
	
	
	 public static void main(String args[]) {
	        double a, b, c;
	        a = 3.0/0;   // Infinity
	        b = 0 / 4.0;   // 0.0
	        c = 0/ 0.0;   // NaN
	        

	      
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	      
	    }
	

	
	
	

}
