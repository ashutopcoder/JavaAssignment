//Bubble Sort 

class BubbleSort{
	public static void main(String args[]){
		int[] arr={10,30,3,5,111,32,78,23,134};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		for(int m=0;m<arr.length;m++){
			System.out.print(arr[m]+" ");
		}
	}
}