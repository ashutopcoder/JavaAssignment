//34) Java Program to Display Even Numbers From 1 to 100
class EvenNum{
	public static void main(String args[]){
		int range=100;
		System.out.println("Even Numbers : ");
		for(int i=1;i<=range;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}