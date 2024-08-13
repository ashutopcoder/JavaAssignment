//3) Java Program to left rotate the elements of an array
import java.util.Scanner;

class LeftRotate{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Times To Rotate : ");
		int times=sc.nextInt();
		for(int i=0;i<times;i++){
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}