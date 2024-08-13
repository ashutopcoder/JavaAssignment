//9) Neon Number in Java

class NeonNumber{
	public static void main(String args[]){
		int num=9;
		int num1=num;
		int sq=num*num;
		int rem=0;
		int sum=0;
		while(sq>0){
			rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sum==num1){
			System.out.println("Number Is Neon");
		}
		else{
			System.out.println("Number Is Not Neon");
		}
	}
}