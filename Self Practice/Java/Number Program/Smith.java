//22) Smith Number in Java 
import java.util.ArrayList;
class Smith{
	public static int SumCalc(int num){
		int sum=0;
		while(num>0){
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
	public static boolean CheckPrime(int num){
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				return false;
		}
		}
		return true;
	}
	public static void main(String args[]){
		int num = 166;
		int total = 0;
		for(int i=2;i<=num/2;i++){
			if(CheckPrime(i)){
				if(num%i==0)
					total+=SumCalc(i);
			}
		}
		if(total==SumCalc(num))
			System.out.println("Smith Number!");
		else
			System.out.println("Smith Number!");
	}
}