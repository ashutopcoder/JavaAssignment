//25) nth Prime Number Java
import java.util.Scanner;

class NthPrime{
	public static boolean CheckPrime(int num){
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Range : ");
		int range=sc.nextInt();
		for(int i=2;i<=range;i++){
			boolean ans=CheckPrime(i);
			if(ans){
				System.out.print(i+" ");
			}
		}
	}
}