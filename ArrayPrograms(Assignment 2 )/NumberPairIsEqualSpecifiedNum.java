/*
find all pairs of elements in an array whose sum is equal to 
a specified number

*/
import java.util.Scanner;
public class NumberPairIsEqualSpecifiedNum{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==num){
					System.out.println(arr[i]+" And "+arr[j]+" Is A Pair. ");
					flag=1;
				}
			}
			if(flag==1)
				break;
		}
		if(flag==0)
			System.out.print("No Possible Pair.");
	}
 }