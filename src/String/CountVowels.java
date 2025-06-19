package String;

public class CountVowels {
	public static void main(String[] args) {
		String str = " hello my name is parikshit";
		String str1 = str.replaceAll("[^aeiouAEIOU]", "");
		
		System.out.println(str1.length());
		
		}
	

}
