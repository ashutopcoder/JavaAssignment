//10) Spy Number in Java

class SpyNumber{
	public static void main(String args[]){
		int num=123;
		int sum=0;
		int product=1;
		int rem=0;
		while(num>0){
		rem=num%10;
		sum=sum+rem;
		product=product*rem;
		num=num/10;
		}
		if(sum==product)
			System.out.println("SpyNumber");
		else
			System.out.println("Not A SpyNumber");
	}
}