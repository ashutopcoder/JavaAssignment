// Find Duplicate Values Array In String :
public class DuplicateStringArray{
	public static void main(String args[]){
		String[] arr={"ashu","mukesh","rakesh","mukesh"};
		System.out.println("Duplicate Values In String : ");
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
				arr[j]=null;
				count++;
				}
			}
			if(count>0&&arr[i]!=null)
			System.out.println(arr[i]+" ");
		}
	}
}