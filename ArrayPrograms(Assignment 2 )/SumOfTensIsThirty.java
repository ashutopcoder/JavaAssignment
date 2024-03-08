//check if the sum of all the 10's in the array is exactly 30.

public class SumOfTensIsThirty{
	public static void main(String args[]){
		int[] arr={1,2,3,10,4,10,30,10,90,80};
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==10){
				count++;
			}
		}
		if(count==3){
			System.out.print("Sum Of 10's Is Exectly 30.");
		}
		else
			System.out.print("Sum Of 10's Is Not Exectly 30.");
			
	}
}