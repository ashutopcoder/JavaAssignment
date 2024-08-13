//2) Prime Number Program in Java
class PrimeNumber{
	public static void main(String []args){
		int num=7;
		int count=0;
		for(int i=2;i<num/2;i++){
			if(num%2==0){
			count++;
			}
		}
		if(count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
			
	}
}