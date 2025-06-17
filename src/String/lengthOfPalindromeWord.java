package String;

public class lengthOfPalindromeWord {
	
	public static void main(String[] args) {
		
		String str = "my MoM said to learn MALAyalam but i am from KataK place it si GadAg distRicT";
		
		String[] str1 = str.split(" ");
		
		for (int i=0;i<str1.length;i++) {
			
			String rev ="";
			for(int j =str1[i].length()-1;j>=0;j--) {
				
				rev = rev+ str1[i].charAt(j);
				
			}
			if(str1[i].equalsIgnoreCase(rev)) {
				System.out.println(str1[i]+" length is "+ str1[i].length());
			}
			
		}
		
		
	}

}
