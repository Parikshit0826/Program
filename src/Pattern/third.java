package Pattern;

public class third {
	public static void main(String[] args) {
		int n = 5;
		
		
//		 	1     
//			2 3    
//			4 5 6   
//			7 8 9 10  
//			11 12 13 14 15 

	
	/* 
	 	
		int num = 1;
		char ch = 'a';
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=n; j++) {
				
				if(i>=j) {
					System.out.print(num++ +" ");				
				}
				else {
					System.out.print(" ");					
				}				
			}
			System.out.println();						
		}
		
	 */
		
	//===========================================================================================	
		
		/*	 
		 	a      
			b  c     
			d  e  f    
			g  h  i  j   
			k  l  m  n  o  

	
		
		
		char ch = 'a';
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=n; j++) {
				
				if(i>=j) {
					System.out.print(ch++ +"  ");				
				}
				else {
					System.out.print(" ");					
				}				
			}
			System.out.println();						
		}	

		*/

		
		
//		A     
//		A B    
//		A B C   
//		A B C D  
//		A B C D E 

		for (int i = 1; i <=n; i++) {
			char ch = 'A';
			for (int j = 1; j <=n; j++) {
				
				if(i>=j) {
					System.out.print(ch++ +" ");				
				}
				else {
					System.out.print(" ");					
				}				
			}
			System.out.println();						
		}	
		
	}		
}


