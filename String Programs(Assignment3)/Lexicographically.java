//Two Strings Lexicographically
public class Lexicographically{
	public static void main(String args[]){
		String str1="Abhishek";
		String str2="Mukesh";
		int num=(int)str1.charAt(0);
		int num1=(int)str2.charAt(0);
		if(num>num1)
			System.out.print("STring 1 Is Greater");
		else if(num<num1)
			System.out.print("String 2 Is Greater");
		else
			System.out.print("Both String Are Equal.");
			
			
	}
}
