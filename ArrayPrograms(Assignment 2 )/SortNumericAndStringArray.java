//Question 1-> To Sort Number And String In Array
public class SortNumericAndStringArray{
	public static void main(String args[]){
		int[] arr={2,8,4,5,1,9,6,3,10,1};
		for( int j=0;j<arr.length;j++){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
	}	
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		String str="ramankumar";
		char[] arr1=str.toCharArray();
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length-1;j++){
				if(arr1[j]>arr1[j+1]){
					char temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr1.length;i++){
				System.out.print(arr1[i]+" ");
			
	}
} 
}