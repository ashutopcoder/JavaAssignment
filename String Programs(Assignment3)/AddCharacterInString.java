//Add Character In A String 
import java.util.Scanner;
public class AddCharacterInString{
	public static void main(String args[]){
		String str="SOHANAL";
		StringBuffer sb = new StringBuffer(str);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter A Character : ");
		char ch=sc.next().charAt(0);
		System.out.println("Enter A Position : ");
		int i=sc.nextInt();
		sb.insert(i,ch);
		str = sb.toString();
		System.out.print(str);
	}
}

