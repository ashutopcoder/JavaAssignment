//16) Java Program to Find 3rd Largest Number in an array

class ThirdLargest{
	public static void main(String args[]){
		int[] arr={1,2,3,42,33,12,54,65,20};
		int count=0;
		System.out.println("Entered Array Elements : ");
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
			System.out.println("\nThird Largest Element Is "+arr[2]);
	}
}