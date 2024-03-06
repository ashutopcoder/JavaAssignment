//Find Index In Array:
import java.util.Scanner;
public class IndexingValue{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Which Value You Whom To Find : ");
		int num=sc.nextInt();
		int flag=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				System.out.print("Enter Value Is Present On Position  : "+(i+1)+" ");
				flag=0;
			}	
		}
		if(flag==1){
		System.out.print("Enter Value Is Not Present.");
		}
	}
}