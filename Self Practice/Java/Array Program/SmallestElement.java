//10) Java Program to print the smallest element in an array
class SmallestElement{
	public static void main(String args[]){
		int[] arr={12,32,1,21,123,432};
		int min=arr[0];
		System.out.println("Entered Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Minimum Value Present In Array Is : "+min);
	}
}