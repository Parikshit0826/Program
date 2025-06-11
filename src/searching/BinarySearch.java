package searching;

public class BinarySearch {
	

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int search=3;
		binarysearch(arr, search);	
	}
	
	static void binarysearch(int [] arr, int search) {
		int li=0;
		int hi = arr.length-1;
		
		while(li<=hi) {
			int mid = (li+hi)/2;
			
			if(arr[mid] == search) {
				System.out.println("the value is present at index : "+ mid);
				return;
			}
			if(arr[mid] < search) {
				li = mid+1;
			}
			else {
				hi= mid-1;
			}	
			
		}
		System.out.println("the value is not present");
		
		
	}
	

}
