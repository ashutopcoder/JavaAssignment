//15)sort the elements of an array in descending order

class DescendingOrderSort{
	public static void main(String args[]){
		int[] arr={1,2,31,231,12,453,234,451};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}