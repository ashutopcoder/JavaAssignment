//Determine The Unicode
/*
a-z=97-112;
A-Z=65-90;
*/ 
import java.util.Scanner;
public class ASCIIValue{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Character : ");
		char ch=sc.next().charAt(0);
		System.out.print((int)ch);		
	}
}