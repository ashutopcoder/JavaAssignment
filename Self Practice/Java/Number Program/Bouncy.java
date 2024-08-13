// BouncyNumber

class Bouncy{
	public static void main(String args[]){
		int num=4234563;
		String str=num+"";
		int len=str.length();
		int[] arr=new int[len];
		for(int i=arr.length-1;i>=0;i--,num=num/10){
			arr[i]=num%10;
		}
		if(len>1){
		int flag=0;
		if(arr[0]<arr[1]){
			for(int i=0;i<arr.length-1;i++){
				if(!(arr[i]<arr[i+1]))
					flag=1;
			}
		}else{
			for(int i=0;i<arr.length-1;i++){
				if(!(arr[i]>arr[i+1]))
					flag=1;
			}
		}
			if(flag==1)
				System.out.println("Bouncy Number");
				else
				System.out.println("Not A Bouncy Number");
		}else
			System.out.println("Number Is Single Digit");
	}
}