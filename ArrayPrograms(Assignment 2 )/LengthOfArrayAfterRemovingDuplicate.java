//Length Of Array After Removing Duplicate Elements:
import java.util.Scanner;
public class LengthOfArrayAfterRemovingDuplicate{
	public static int[] Remove(int[] ar){
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if((ar[i]==ar[j])&&(ar[j]!=1))
					ar[j]=-1;
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={1,2,3,4,4,3,5,6,7,8,6,};
		int[] newArr=Remove(arr);
		int count=0;
		for(int i=0;i<newArr.length;i++){
			if(newArr[i]!=-1){
			count++;
			}
		}
		System.out.print("Size of Array Is : "+count);
		
	}
} 