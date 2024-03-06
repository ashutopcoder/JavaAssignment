//Common Elements B/W Two Array Integer

public class CommonElementBWTwoArray{
	public static void main(String args[]){
		int[] arr1={1,2,3,4,5,6,7,8,9,10};
		int[] arr2={4,23,22,11,55,66,9,10,3,12};
		System.out.println("Repeated Elements BW Two Arrays : ");
			for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if((arr1[i]==arr2[j])){
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
} 


