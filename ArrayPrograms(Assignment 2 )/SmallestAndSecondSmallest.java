//Smallest And SecondSmallest Number: 
public class SmallestAndSecondSmallest{
	public static int[] AscendingOrder(int[] ar){
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				if(ar[i]<ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={10,15,30,8,9,7,1,5,37,7,3};
		int[] newArr=AscendingOrder(arr);
		System.out.println("First Smallest And Second Smallest Value Is : ");
		for(int i=0;i<2;i++){
			System.out.println(newArr[i]+" ");
		}
	}
}