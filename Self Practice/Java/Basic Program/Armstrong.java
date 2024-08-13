//5) Armstrong Number in Java
import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int arm=0;
		int temp=num;
		int rem=0;
		while(num>0){
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(temp==arm){
			System.out.println("Armstrong Number.");
		}
		else{
			System.out.println("Not A Armstrong Number");
		}
	}
}