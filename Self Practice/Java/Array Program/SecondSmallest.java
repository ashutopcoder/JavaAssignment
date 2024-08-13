//19) Java Program to Find 2rd Smallest Number in an array

class SecondSmallest{
	public static void main(String args[]){
		int[] arr={101,20,3,42,33,12,54,65,20};
		int count=0;
		System.out.println("Entered Array Elements : ");
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
			System.out.println("\nSecond Smallest Element Is "+arr[1]);
	}
}