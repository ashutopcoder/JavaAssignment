//Practice Array LEFT ROTATION
/*
import java.util.Scanner;
class Practice{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = {12,34,45,56,67,87,63,27,48,47};
		System.out.print("Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nEnter Number of Rotations : ");
		int rt = sc.nextInt();
		int m=0;
		for(int i=1;i<=rt;i++){
			
			int temp = arr[0];
			for(m=0;m<arr.length-1;m++)
				arr[m]=arr[m+1];
			arr[m]=temp;
		}
		System.out.print("\nRotated Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
*/
/*
class Practice{
	public static void main(String args[]){
		int[] arr={12,10,13,12,34,21,10};
		int count=0;
		for(int i=0;i<arr.length-count;i++){
			for(int j=i+1;j<arr.length-count;j++){
				if(arr[i]==arr[j])
				{
					for(int m=j;m<arr.length-1;m++)
						arr[m]=arr[m+1];
					count++;
				}
			}
		}
		for(int i=0;i<arr.length-count;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
*/
import java.util.*;
class Practice{
	public static void main(String[] args){
		int[] arr={12,10,13,12,34,21,10};
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++)
			hs.add(arr[i]);
		System.out.println(hs);
	}
}