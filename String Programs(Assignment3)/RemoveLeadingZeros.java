//Remove Leading Zeros: 
import java.util.Scanner;
public class RemoveLeadingZeros{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str="ABCDER00FI0KJB0JHVKJBJK00";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='0')
				System.out.print(str.charAt(i));
		}
	}
}