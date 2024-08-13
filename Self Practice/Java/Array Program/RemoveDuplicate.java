//21) Java Program to Remove Duplicate Element in an array

class RemoveDuplicate{
	public static void main(String args[]){
		int[] arr={12,1,2,2,1,3,4,56,76,5,56};
			for(int i=0;i<arr.length;i++){
				int flag=0;
				for(int j=i+1;j<arr.length;j++){
						if(arr[i]==arr[j]){
							flag=1;
						}
				}
				if(flag!=1){
					System.out.print(arr[i]+" ");
				}
			}
	}
}