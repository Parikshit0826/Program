package String;

public class removeConsonentAndReverse {
	public static void main(String[] args) {
		String str =" hello this is me";
		//	String str1 = str.replaceAll("[AEIOUaeiou]", "");
			
			String str2 = str.replaceAll("[^AEIOUaeiou ]", "");
			String rev = "";
			
			for(int i =str2.length()-1; i>=0;i--) {
				
				rev+=str2.charAt(i);
		
			}
			System.out.println(rev);
	}

}
