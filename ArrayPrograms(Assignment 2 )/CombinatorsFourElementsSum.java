/*Find All Combinators Of Four Elements Of Array Whose 
Sum Is Is Equal To Entered Number .
*/
import java.util.Scanner;
public class CombinatorsFourElementsSum{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneer A Number : ");
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				for(int k=0;k<arr.length;k++){
					for(int l=0;l<arr.length;l++){
						if(arr[i]+arr[j]+arr[k]+arr[l]==num){
							System.out.println("Pair : "+arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
						}
					}
				}
			}
		}
	}
}