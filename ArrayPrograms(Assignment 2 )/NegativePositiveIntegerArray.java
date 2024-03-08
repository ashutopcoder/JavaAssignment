/*
program to arrange the elements of an array of integers so that all 
negative integers appear before all positive integers.
*/
public class NegativePositiveIntegerArray{
	public static int[] AscendingOrder(int[] ar){
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				if(ar[i]<ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={1,2,3,-1,-2,-4,-3,5,6,8,-8};
		int[] newArr=AscendingOrder(arr);
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}