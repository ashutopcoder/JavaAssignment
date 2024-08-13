//Linear Search
import java.util.Scanner;
class LinearSearch{
	public static int SearchNum(int[] arr,int num){
		for(int i=0;i<arr.length;i++){
			if(num==arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String args[]){
		int[] arr={10,30,89,9,67,654,76};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Which You Want To Find : ");
		int num=sc.nextInt();
		int ans=SearchNum(arr,num);
		if(ans==-1)
			System.out.println("Entered Number is Not Present...!");
		else
			System.out.println(num+" Is present On Position "+(ans+1));
	}
}