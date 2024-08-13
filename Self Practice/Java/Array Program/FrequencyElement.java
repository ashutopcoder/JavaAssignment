//2) Java Program to find the frequency of each element in the array

class FrequencyElement{
	public static void main(String args[]){
		int[] arr={10,20,10,30,32,12,20,10,32};
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]==arr[j])&&(arr[j]!=-1)){
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1){
				System.out.println(arr[i]+" Frequency Is : "+count);
			}
		}
	}
}
