//8)print the elements of an array present on odd position
class OddPositionElement{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i=i+2){
			System.out.println(arr[i]+" ");
		}
	}
}