//30) Java Program to Find Largest of Three Numbers

class FindLargestAmongThree{
	public static void main(String args[]){
		int num1=10;
		int num2=50;
		int num3=20;
		System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);
		System.out.println("Number 3 : "+num3);
		if((num1>num2)&&(num1>num3)){
			System.out.println("Number 1 "+num1+" Is Greater In All Numbers.");
		}else if((num2>num1)&&(num2>num3)){
			System.out.println("Number 2 "+num2+" Is Greater In All Numbers.");
		}else
			System.out.println("Number 3 "+num3+" Is Greater In All Numbers.");
			
	}
}