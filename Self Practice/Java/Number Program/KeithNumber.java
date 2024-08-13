//8) Keith Number in Java

class KeithNumber{
	public static void main(String args[]){
		int number = 742;
		int num = number;
		int len = Integer.toString(num).length();
		int[] arr=new int[len];
		int flag=0;
		int sum=0;
		int j=0;
		for(int i=len-1;num>0;num=num/10){
			arr[i]=num%10;
			i--;
		}
		while(sum<number){
			sum=0;
			for(int i=0;i<arr.length;i++){
				sum=sum+arr[i];
			}
			if(sum==number){
				flag=1;
				break;
			}
			for(j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[j]=sum;
		}
		if(flag==1){
			System.out.println("Number Is Keith Number.");
		}
		else{
			System.out.println("Number Is Not Keith Number.");
		}
	}
}