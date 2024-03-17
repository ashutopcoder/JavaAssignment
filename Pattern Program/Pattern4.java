/*
1     1
 2   2
  3 3 
   4
  3 3 
 2   2
1     1
*/
public class Pattern4{
	public static void main(String args[]){
		int m=1;
		int n=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if(m==j)
				System.out.print(j);
				else
				System.out.print(" ");
			}
			for(int j=3;j>=1;j--){
				if(m==j)
				System.out.print(j);
				else
				System.out.print(" ");
			}
			if(m==4)
				n=-1;
			m=m+n;
			System.out.println();
			
		}
	}
}