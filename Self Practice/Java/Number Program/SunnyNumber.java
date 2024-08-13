//5) Sunny Number in Java

class SunnyNumber{
	public static boolean Sqrt(int num){
		int temp=0;
		int sqrt=0;
		for(int i=1;i<num/2;i++){
			sqrt=i*i;
			if(num==sqrt){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		int num=9;
		int copy=num;
		int num1=num+1;
		boolean ans=Sqrt(num1);
		if(ans)
			System.out.println("Number Is Sunny Number.");
		else
			System.out.println("Number Is Not Sunny Number.");
	}
}