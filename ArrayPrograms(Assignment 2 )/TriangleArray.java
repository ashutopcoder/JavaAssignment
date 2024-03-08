/* lengths of any two sides of a triangle must be greater to 
than or equal the length of the third side
*/
public class TriangleArray{
	public static void main(String args[]){
		int[] arr={1,2,3,17,20,6,4,70,110};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					if((arr[i]+arr[j])<=arr[k])
						System.out.print("\nTriangle Found "+arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}
}