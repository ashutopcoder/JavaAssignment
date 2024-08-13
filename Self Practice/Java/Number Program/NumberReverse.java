//1) How to Reverse a Number in Java

class NumberReverse{
	public static void main(String args[]){
		int num=123;
		int copy=num;
		int temp=0;
		int rem=0;
		while(num>0){
		temp=num%10;
		rem=rem*10+temp;
		num=num/10;
		}
		System.out.println("Number : "+copy);
		System.out.println("After Number Reverse : "+rem);
	}
}