//36) Java Program to Find Sum of Natural Numbers
import java.util.Scanner;
class SumNaturalNumber{
	public static void main(String args[]){
		System.out.println("Enter A Range : ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int sum=0;
		for(int i=1;i<=range;i++){
			sum=sum+i;
		}
		System.out.println("Sum Of Naturl Numbers Is : "+sum);
	}
}