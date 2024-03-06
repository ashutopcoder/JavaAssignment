//Convert Array Into ArrayList.
import java.util.ArrayList;
public class ConvertArrayIntoArrayList{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			al.add(arr[i]);
		}
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
	}
}