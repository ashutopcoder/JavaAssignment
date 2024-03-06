//Duplicate Values In Array : 
public class DuplicateValuesArray{
	public static void main(String args[]){
		int[] arr={1,2,3,1,2,3,5,6,78,8,8,7,7,78};
		System.out.println("Duplicate Elements In Array : ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					System.out.print(arr[i]+" ");
			}
		}
	}
}