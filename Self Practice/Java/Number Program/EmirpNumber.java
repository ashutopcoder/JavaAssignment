//13) Emirp Number in Java

class EmirpNumber{
	public static boolean CheckPrime(int num){
		int count=0;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count!=0){
			return false;
		}
		return true;
	}
	public static void main(String args[]){
		int num=17;
		int copy=num;
		int rev=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		boolean ans1=CheckPrime(copy);
		boolean ans2=CheckPrime(rev);
		if((ans1==true)&&(ans2==true)){
			System.out.println("Emirp Number");
		}
		else
			System.out.println("Not  Emirp Number");
			
	}
}