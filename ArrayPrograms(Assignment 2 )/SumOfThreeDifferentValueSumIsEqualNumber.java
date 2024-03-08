/* find all the distinct triplets such that the sum of all 
	the three elements equal to a specified number.
*/
import java.util.Scanner;
public class SumOfThreeDifferentValueSumIsEqualNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int flag=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				for(int k=0;k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k]==num){
						System.out.println("Integers Found : "+arr[i]+" , "+arr[j]+" , "+arr[k]);
						flag=1;
					}
				}
			}
					if(flag==1)
						break;
			
		}
		if(flag==0)
					System.out.print("No Possible Outcome Found .");
			
	}
}