package Interview;

public class IntegerToBinary {
	
	public static void main(String[] args) {
		
		int no = 6;
		
		String binary ="";
		
		while(no!=0) {
			int rem = no%2;
			binary=rem+binary;
			no = no/2;
			
			
		}
		
		System.out.println(binary);
	}
	

}
