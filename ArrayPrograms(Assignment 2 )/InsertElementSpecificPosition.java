//Insert Element At specific Position : 
import java.util.Scanner;
public class InsertElementSpecificPosition{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Position : ");
		int pos=sc.nextInt();
		System.out.println("Enter A Value Which You Want To Store : ");
		int val=sc.nextInt();
		for(int i=arr.length-1;i>pos-1;i--){
			arr[i]=arr[i-1];
		}
		arr[pos-1]=val;
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			
	}
	
}