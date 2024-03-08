//Find Common Value In three Sorted Array : 
public class CommonValueInThreeArray{
	public static void main(String args[]){
		int[] arr1={1,2,30,4,50,6,7,8,9,10};
		int[] arr2={11,2,3,4,5,66,7,8,9,10};
		int[] arr3={1,2,3,44,55,6,7,88,99,100};
		System.out.println("Common Items");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					for(int k=0;k<arr3.length;k++){
						if(arr1[i]==arr3[k])
							System.out.print(arr1[i]+" ");
					}
				}
			}
		}
	}
}