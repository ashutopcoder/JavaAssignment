//ArrayList To Array Conversion
import java.util.ArrayList; 
public class ArrayListToArrayConversion{
	public static void main(String Args[]){
		ArrayList<Integer> al={1,2,3,4,5,6,7,8,9,10};
		int[] arr=new int[al.size()];
		for(int i=0;i<arr.length;i++){
			arr[i]=al.get(i);
		}
	}
} 