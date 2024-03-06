//Find Second Smallest Number In Array
public class SecondSmallestValue{
	public static int[] AscendingOrder(int[] ar){
		for(int i=1;i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				if(ar[j]>ar[i]){
					ar[i]=ar[j]+ar[i];
					ar[j]=ar[i]-ar[j];
					ar[i]=ar[i]-ar[j];
				}
			}
		}
		return ar;
	}

	public static void main(String args[]){
		int[] arr={1,3,2,223,435,123,987,456,101,1001,520};
		int[] newArr =AscendingOrder(arr);
		for(int i=1;i<=1;i++){
		System.out.print("Smallest Second Value In Array : "+newArr[1]);
		}
	 }
}
