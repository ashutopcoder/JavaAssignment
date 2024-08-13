//3) Palindrome Program in Java

class Palindrome{
	public static void main(String args[]){
		int num=121;
		int temp=num;
		int rem=0;
		int sum=0;
		while(num>0){
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum){
			System.out.println("Number Is Palindrome");
		}
		else{
		System.out.println("Number Is Not A Palindrome");
		}
	}
}