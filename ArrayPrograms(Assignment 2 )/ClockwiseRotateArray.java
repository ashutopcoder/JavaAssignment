//program to cyclically rotate a given array clockwise by one
import java.util.Scanner;
public class ClockwiseRotateArray{
	public static int[] Reverse(int[] ar,int rotation){
		for(int i=0;i<rotation;i++){
			int temp=ar[ar.length-1];
			for(int j=ar.length-1;j>0;j--){
				ar[j]=ar[j-1];
			}
			ar[0]=temp;
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How many Time To Rotate : ");
		int num =sc.nextInt();
		int[] newArr=Reverse(arr,num);
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}