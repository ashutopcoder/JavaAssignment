//Leader Element In Array :
public class LeaderElementArray{
	public static void main(String args[]){
		int[] arr={1,2,3,5,4,6,7,1,1,4,5,3,6,4};
		
		for(int i=0;i<arr.length;i++){
			int flag=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					flag=0;
					break;
				}
			}
			if(flag==1)
			System.out.print("\n Leader Value Is "+arr[i]);
			
		}
	
	}
}