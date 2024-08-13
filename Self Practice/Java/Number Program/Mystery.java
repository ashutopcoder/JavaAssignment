//21) Mystery Number in Java 

class Mystery{
	public static int ReverseFun(int num){
		int temp=0;
		int sum=0;
		while(num>0){
			temp=num%10;
			sum=sum*10+temp;
			num=num/10;
		}
		return sum;
	}
	public static void main(String args[]){
		int num=154;
		int temp=num;
		int copy=num;
		for(int i=1;i<num/2;i++){
			int rev=ReverseFun(i);
			if((i+rev)==temp)
				System.out.println(i+" "+rev+" = "+temp+" So Number Is Mystery");
		}
	}
}