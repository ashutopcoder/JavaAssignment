//Two Array Equality Program
public class TwoArrayEquality{
	public static void main(String args[]){
		int[] arr1={10,20,30,40,50,60,70,90,90,100};
		int[] arr2={10,20,30,40,50,60,70,80,90,100};
		int flag=1;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				flag=0;
			}
		}
		if(flag==1)
			System.out.print("Array Is Equality");
		else
			System.out.print("Array Not Is Equality");
			
	}
}