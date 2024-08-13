//4) Java Program to print the duplicate elements of an array

class PrintDuplicate{
	public static void main(String args[]){
		int[] arr={1,2,3,1,4,2,5,4,6,6};
		for(int i=0;i<arr.length;i++){
			int count=0;
			if(arr[i]!=-1){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						count++;
						arr[j]=-1;
					}
				}
				if(count>0)
					System.out.print(arr[i]+" ");
			}
		}
	}
}