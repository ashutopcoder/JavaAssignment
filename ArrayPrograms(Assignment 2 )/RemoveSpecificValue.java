//Remove Specific Value .
import java.util.Scanner;
public class RemoveSpecificValue{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Value : ");
		int num=sc.nextInt();
		int flag=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=num){
				flag=0;
			}
			if(arr[i]!=num){
				System.out.print(arr[i]+" ");
			}
				
		}
		System.out.println();
		System.out.println("Value Is Not Present");
	}
}