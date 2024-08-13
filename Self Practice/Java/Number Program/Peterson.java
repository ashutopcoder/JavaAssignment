//4) Peterson Number in Java

class Peterson{
	public static int FindFact(int x){
		int sum = 0;
		while(x>0){
			int fact = 1;
			int num=x%10;
			for(int i=num;i>=2;i--)
				fact=fact*i;
			sum=sum+fact;
			x=x/10;
		}
		return sum;
	}
	public static void main(String args[]){
		int num=145;
		if(num==FindFact(num))
			System.out.println("Peterson");
		else
			System.out.println("Not Peterson");		
	}
}