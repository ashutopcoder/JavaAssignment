//Two Number Positive And Negative Sum IS Near To Zero:
public class SumIsNearZero{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,-8,-1,4,9,-17};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(((arr[i]+arr[j])<2)&&((arr[i]+arr[j])>-2)){
					System.out.print("\nFound "+arr[i]+" And "+arr[j]);
				}
			}
		}
	}
}