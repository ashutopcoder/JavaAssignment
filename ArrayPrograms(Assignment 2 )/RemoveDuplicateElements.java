//RemoveDuplicate Elements From An Array:
public class RemoveDuplicateElements{
	public static int[] Remove(int[] ar){
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if((ar[i]==ar[j])&&(ar[j]!=-1)){
					ar[j]=-1;
				}
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={1,2,3,1,3,4,5,64,4,23,1};
		int[] newArr=Remove(arr);
		for(int i=0;i<newArr.length;i++){
			if(newArr[i]!=-1){
				System.out.print(newArr[i]+" ");
			}
		}
	}
}