//Replace A Character At Specific Index : 
import java.util.Scanner;
public class ReplaceCharacter{
	public static void main(String args[]){
		String str ="RAMANKUMAR";
		StringBuffer sb=new StringBuffer(str);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Which Place To Replace Value : ");
		int num=sc.nextInt();
		System.out.println("Enter Character : ");
		char ch=sc.next().charAt(0);
		sb.setCharAt(num,ch);
		str=sb.toString();
		System.out.println(str);
	}
}