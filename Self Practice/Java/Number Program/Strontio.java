// 23) Strontio Number in Java
class Strontio{
	public static void main(String args[]){
		int num = 2222;
		if( (((num*2)%100)/10)==(((num*2)%1000)/100) )
			System.out.println("Storntio Number!");
		else
			System.out.println("Not Storntio Number!");
	}
}