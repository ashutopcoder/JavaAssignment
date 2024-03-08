//Check Rotation Array 
public class CheckRotationArray{
	public static int Check(int[] ar1,int[] ar2){
		int count=0;
		for(int i=0;i<ar1.length;i++){
				count++;
				if(ar1[0]==ar2[i]){
					break;
				}
		}	
		return count;
	}
	public static void main(String args[]){
		int[] arr1={1,2,3,4,5,6,7,8,9,10};
		int[] arr2={8,9,10,1,2,3,4,5,6,7};
		int ans =Check(arr1,arr2);
		System.out.print("NO Of Times Rotation Occur : "+ans);
		
	}
}