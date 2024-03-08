/*longest consecutive elements sequence from 
	an unsorted array of integers
*/
public class ConsecutiveElementSequence{
	public static int[] Ascending(int[] ar){
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
		int[] arr= {49, 1, 3, 200, 2, 4, 70, 5};
		int[] ar1=Ascending(arr);
		int count=1;
		for(int i=0;i<ar1.length-1;i++){
			for(int j=i+1;j<ar1.length;j++){
			if((ar1[i]+1)==(ar1[j])){
				count++;
			}
			}
		}
		System.out.print(count);
	}
}