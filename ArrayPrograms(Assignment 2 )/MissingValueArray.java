//Missing VAlue In Array: 
import java.util.Scanner;
public class MissingValueArray{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Value : ");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i])
				flag=1;
		}
		if(flag==1)
			System.out.print("VAlue Found ");
		else
			System.out.print("Value Missing . ");
			
			
		
	}
}