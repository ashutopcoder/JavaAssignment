//GCD Of Two Numbers
import java.util.Scanner;
class GCD{
	public static int Minimum(int num1,int num2){
		if(num1>num2){
			return num1;
		}
		return num2;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter B Number : ");
		int num2=sc.nextInt();
		int minimum=Minimum(num1,num2);
		int hcf=1;
		for(int i=1;i<=minimum;i++){
			if((num1%i==0)&&(num2%i==0))
				hcf=i;
		}
		System.out.println("GCD Of Number Is : "+hcf);
	}
}