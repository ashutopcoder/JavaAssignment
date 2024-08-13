//19) Krishnamurthy Number Java--145 is krishnamurthy.
import java.util.Scanner; 
class Krishnamurthy{
	public static int FindFactorial(int num){
		int fact=1;
		for(int i=num;i>=1;i--){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		int num1=num;
		int ans=0;
		int temp=0;	
		while(num>0){
			temp=num%10;
			num=num/10;
		ans=ans+FindFactorial(temp);
		}
		if(num1==ans)
			System.out.println("Krishnamurthy Number");
		else
			System.out.println("Not Krishnamurthy Number");
	}
}