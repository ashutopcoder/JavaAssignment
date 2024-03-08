/*
SumOf All Values Excepts Largest and Smallest 
*/

public class SumMiddleValuesLArgeAndSmall{
	public static int Large(int[] ar){
		int num=ar[0];
		for(int i=1;i<ar.length;i++){
			if(ar[i]>num)
				num=ar[i];
		}
		return num;
	}
	public static int Small(int[] ar1){
		int number=ar1[0];
		for(int i=1;i<ar1.length;i++){
			if(number>ar1[i])
				number=ar1[i];
		}
		return number;
	}
	public static void main(String args[]){
		int[] arr={10,20,300,40,5,655,720,8,90,10};
		int num1=Large(arr);
		int num2=Small(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if((arr[i]!=num1)&&(arr[i]!=num2)){
				sum=sum+arr[i];
			}
		}
		System.out.print("Sum Of Integers Except Largest And Smallest Value Is : "+sum);
	}
}