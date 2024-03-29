/*
Greatest Value Between Three
*/
import java.util.Scanner;
class Problem1{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a =sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b =sc.nextInt();
		System.out.println("Enter Third Number : ");
		int c =sc.nextInt();
		if((a>b)&&(a>c))
			System.out.println("First Value Is Greater .");
		else if((b>a)&&(b>c))
			System.out.println("Second Value Is Greater .");
			 else
				 System.out.println("Third Value Is Greater .");
		
	}
}