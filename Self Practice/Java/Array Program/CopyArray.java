//1) Java Program to copy all elements of one array into another array

class CopyArray{
	public static void main(String args[]){
		int[] arr={10,20,30,40,23};
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr.length;i++){
		System.out.println(arr1[i]);
		}
	}
}