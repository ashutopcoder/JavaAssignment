//32) Java Program to Check if a Number is Positive or Negative
import java.util.Scanner;
class NegativePositive{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num1=sc.nextInt();
		if(num1>0)
			System.out.println("Number is Positive...!");
		else if(num1==0)
			System.out.println("Number is Zero...!");
			else
			System.out.println("Number is Negative...!");
	}
}