//String split Into Sub-String 
import java.util.Scanner;
public class StringIntoSubString{
	public static void main(String args[]){
		String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int len = str.length()/num;
		int m=0;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			m++;
			if(m%len==0){
			System.out.println();
			count++;
			}
			if(count==num)
				break;
		}
	}
}