/*
 A majority element is an element that appears more than 
 n/2 times where n is the array size

 */
 public class MajorityElement{
	 public static void main(String args[]){
		 int[] arr={1,2,3,1,1,4,1,4,1,1,4,3,5};
		 int count=0;
		 for(int i=0;i<arr.length;i++){
				count=0;
			 for(int j=0;j<arr.length;j++){
				 if(arr[i]==arr[j]){
					 count++;
				 }
			 }
			 if(count>=arr.length/2){
					 System.out.println("Majority Element Is : "+arr[i]);
					 break;
				 }
		 }
	 }
 }