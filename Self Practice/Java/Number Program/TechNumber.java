//6) Tech Number in Java

class TechNumber{
	public static void main(String args[]){
		int num=2025;
		int c = Integer.toString(num).length();
		if(c%2==0){
			int pow = (int)Math.pow(10,c/2);
			int first = num/pow;
			int second = num%pow;
			int square=(first+second)*(first+second);
			if(square==num){
				System.out.println("Number Is A Tech Number");
			}
			else
			{
				System.out.println("Number Is Not A Tech Number");
			}
			
		}else{
			System.out.println("Digits Are Not Even ,So Number Is Not A Tech NUmber.");
		}
		
		
	}
}