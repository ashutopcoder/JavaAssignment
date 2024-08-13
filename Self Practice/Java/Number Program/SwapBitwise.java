//28) Java Program to Swap Two Numbers Using Bitwise Operator

class SwapBitwise{
	public static void main(String args[]){
		int a=10;
		int b=20;
		System.out.println("Before Swapping : ");
		System.out.println("Value Of A Is : "+a);
		System.out.println("Value Of B Is : "+b);
		System.out.println("------------------");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping : ");
		System.out.println("Value Of A Is : "+a);
		System.out.println("Value Of B Is : "+b);
		System.out.println("------------------");
		
		}
}
