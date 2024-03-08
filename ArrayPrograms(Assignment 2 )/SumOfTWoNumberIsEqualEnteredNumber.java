//Sum Of Two Numbers IS exectly Equal To Entered Number :
import java.util.Scanner;
public class SumOfTWoNumberIsEqualEnteredNumber{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Number : ");
	int num=sc.nextInt();
	int flag=0;
	int[] arr={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]+arr[j]==num){
					System.out.print("PossibleOutcome : "+arr[i]+"  "+arr[j]);
					flag=1;
				}
			}
				if(flag==1){
					break;
				}
		}
			if(flag==0)
			System.out.print("No Possible Outcome . ");		
	}
}