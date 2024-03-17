/*
     1
	1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 510 105 1 
*/
class Pattern17{
	public static int Fact(int m){
		int z=1;
		for(int x=1;x<=m;x++)
			z=z*x;
		return z;
	}
	public static void main(String args[]){
		for(int i=0;i<6;i++){
			for(int k=6;k>i;k--)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print(Fact(i)/(Fact(i-j)*Fact(j))+" ");
			System.out.println();
		}
	}
}