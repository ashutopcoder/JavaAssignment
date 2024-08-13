//22) Java Program to Print Odd and Even Numbers from an array

class OddEvenNumber{
	public static void main(String args[]){
		int[] arr={11,2,32,4,52,6,7,8,29,10};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.println("Even Number : "+arr[i]+" ");
			}
			else{
				System.out.println("Odd Numbers : "+arr[i]+" ");
			}
		}
	}
}