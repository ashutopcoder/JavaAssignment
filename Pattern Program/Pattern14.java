/*
1
2 3
4 5 6
7 8 9 10
*/
public class Pattern14{
	public static void main(String args[]){
		int m=1;
		for(int i=1;i<=5;i++){
			if(m<=10){
			for(int j=1;j<=i;j++){
				System.out.print(m+" ");
				m++;
			}
			}
			System.out.println();
		}
	}
}