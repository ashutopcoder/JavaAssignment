/*check if an array of integers contains two 
specified elements 65 and 77

*/
public class CheckValueIsPresentOrNot{
	public static void main(String args[]){
		int flag=1;
		int count=0;
		int[] arr = {32,56,34,77,65,68,65,45,34};
		for(int i=0;i<arr.length;i++){
			if(arr[i]==65){
				flag=0;
				count++;
				System.out.println("65 Found!");
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==77){
				flag=0;
				count++;
				System.out.println("77 Found!");
				break;
			}
		}
		if(flag==1)
			System.out.println("Values Not Found!");
		if(count==2)
			System.out.println("Both Values Found!");
	}
}