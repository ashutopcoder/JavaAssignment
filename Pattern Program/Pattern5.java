/*
 1  2  3  4  5
16             6
15             7
14             8
13 12 11 10  9
*/

class Pattern5{
	public static void main(String[] args){
		int m=16;
		int n=1;
		for(int i=1;i<=5;i++){
			System.out.printf("%2d ",i);
		n++;
		}
		System.out.println();
		for(int j=m;j>=14;j--){
			System.out.printf("%2d            %2d",m,n);
			System.out.println();
			n++;
			m--;
		}
		for(int j=13;j>=9;j--){
			System.out.printf("%2d ",j);
		}
		
		
	}
}