/*
sort an array of positive integers from an array.In the sorted array
 the value of the first element should be maximum, the second value 
should be a minimum, third should be the second maximum, 
the fourth should be the second minimum and so on.
*/
public class FirstMAxFirstMinSecondMaxSecondMin{
	public static int[] Descending(int[] ar){
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				if(ar[i]>ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={10,4,5,3,2,6,7,1,8,9};
		int[] newArr=Descending(arr);
		int start=0;
		int end=arr.length-1;
		while(start<end){
			System.out.print(newArr[start]+" ");
			System.out.print(newArr[end]+" ");
			start++;
			end--;
			
		}
	}
}