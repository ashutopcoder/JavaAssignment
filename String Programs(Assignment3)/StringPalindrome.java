//String Is Palindrome
public class StringPalindrome{
	public static void main(String args[]){
		String str1="MADAM";
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
			str2=str2+str1.charAt(i);
		if(str1.equals(str2)){
			System.out.print("String Is Palindrome.");
		}
		else
			System.out.print("String Is Not Palindrome.");
			
		
	}
}