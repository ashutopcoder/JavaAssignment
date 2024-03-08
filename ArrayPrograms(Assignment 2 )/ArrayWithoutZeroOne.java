//Array Is Without 0And-1: 
public class ArrayWithoutZeroOne{
	public static void main(String args[]){
		int[] arr={1,2,3,0,4,5,-1,6,7,8,0};
		for(int i=0;i<arr.length;i++){
			if((arr[i]!=0)&&(arr[i]!=-1))
				System.out.print(arr[i]+" ");
		}
	}
}