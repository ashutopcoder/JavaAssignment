//27) Java Program to Find Square Root of a Number Without sqrt Method
import java.util.Scanner;
class SquareRoot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		int i;
		int temp=num;
		for(i=2;i<num/2;i++){
			if(num==(i*i)){
				break;
			}
		}
		System.out.println("SquareRoot Of Number "+temp+" Is : "+i);
	}
}