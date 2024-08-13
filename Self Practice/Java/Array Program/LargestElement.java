//9) Java Program to print the largest element in an array

class LargestElement{
	public static void main(String args[]){
		int[] arr={10,20,5,32,12,45,654,876,1234,123};
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum Element Present In Array : "+max);
	}
}