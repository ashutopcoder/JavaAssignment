//  Average Value Of Array Elements

public class AverageArray{
	public static void main(String args[]){
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		int av=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		av=sum/arr.length;
		System.out.print("Averagr Value Of Array Elements : "+av);
		
	}
}