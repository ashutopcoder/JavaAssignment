//Iterate Over Characters in String
import java.util.Scanner;
public class IterateString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String : ");
		String str =sc.next();
		for(int i=0;i<str.length();i++)
		System.out.print("\n"+str.charAt(i));
	}
}