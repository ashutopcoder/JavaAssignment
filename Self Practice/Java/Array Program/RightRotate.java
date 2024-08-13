//Right Rotate
import java.util.Scanner;
class RightRotate{
	public static int[] Rotate(int[] ar,int range){
		for(int i=0;i<range;i++){
			int temp=ar[ar.length-1];
			for(int j=ar.length-1;j>0;j--){
				ar[j]=ar[j-1];
			}
			ar[0]=temp;
		}
		return ar;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How Many Times To Rotate : ");
		int range=sc.nextInt();
		int[] arr={1,2,3,4,5,6,7,8,9};
		int[] newArr=Rotate(arr,range);
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}