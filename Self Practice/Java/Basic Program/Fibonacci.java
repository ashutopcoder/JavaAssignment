// Fibonacci Series in Java
// 0 1 1 2 3 5 8 13 21 ....
class Fibonacci{
	public static void main(String args[]){
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<11;i++){
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}