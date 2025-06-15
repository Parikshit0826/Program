package Interview;

import java.util.Arrays;

public class interview2 {
	
	 public static void main(String[] args) {
	        int[] arr = {2, 10, 3, 4, 20, 5};
	        changeMultiples(arr);
	    }

	    public static void changeMultiples(int[] arr) {
	        int multiple = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 10 == 0) {
	                multiple = arr[i];
	            } else if (multiple != 0) {
	                arr[i] = multiple;
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	    }
}
