//33) Java Program to Check if a Given Number is Perfect Square
import java.util.Scanner;
class PerfectSquare{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  Number : ");
		int num=sc.nextInt();
		int num1=num;
		int flag=0;
		int i;
		for(i=1;i<=num/2;i++){
			if(i*i==num1){
				flag=1;
			break;
			}
		}
		if(flag==1){
			System.out.println("Perfect Square Of Number "+num1+" Is "+i);
		}else{
			System.out.println("There Is Not A Perfect Square Number .");
		}
	}
}