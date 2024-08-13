//31)Find Smallest of Three Numbers Using Ternary Operator

class SmallestTernaryOperator{
	public static void main(String args[]){
		int num1=10;
		int num2=20;
		int num3=11;
		System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);
		System.out.println("Number 3 : "+num3);
		System.out.println("--------------------");
		int temp=num1<num2?num1:num2;
		int small=temp<num3?temp:num3;
		System.out.println("Smallest Number Using Ternary Operator Among Three : "+small);
		System.out.println("--------------------");
		
	}
}