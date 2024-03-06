//Find Maximum Value And Minimum Value In Array:
public class MaxMinValueArray{
	public static int Maximum(int[] ar){
		int max=ar[0];
		for(int i=1;i<ar.length-1;i++){
			if(ar[i]>max){
				max=ar[i];
			}
		}
		return max;
	}
	public static int Minimum(int[] arrr){
		int min=arrr[0];
		for(int i=1;i<arrr.length;i++){
			if(arrr[i]<min)
				min=arrr[i];
		}
		return min;
	}
	public static void main(String args[]){
		int[] arr={4,2,3,56,777,111,321,432,20,1,543,214};
		int maxx=Maximum(arr);
		int minn=Minimum(arr);
		System.out.println("Maximum Value In Array Is : "+maxx);
		System.out.println("Minimum Value In Array Is : "+minn);
		
	}
}