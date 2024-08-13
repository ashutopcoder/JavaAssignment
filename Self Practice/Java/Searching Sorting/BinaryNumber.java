//Binary Search 
// In Binary Search The Order Of Element Must Be Sorted InAscendingOr Descending
import java.util.Scanner;
class BinaryNumber{
	public static int CheckNum(int[] arr,int num){
		int start=arr[0];
		int end=arr.length-1;
		while(start<end){
			int mid=(start+end)/2+1;
			if(num==arr[mid])
				return mid;
			if(num>arr[mid])
				start=mid;
			else
				end=mid;
				
		}
		
		return -1;
	}
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number Which You Want To find : ");
		int num=sc.nextInt();
		int ans=CheckNum(arr,num);
		if(ans==-1)
			System.out.println("Entered Number Is Not Present In Given Values.");
		else
			System.out.println(num+" Is Finding On Position "+(ans+1));
	}
}