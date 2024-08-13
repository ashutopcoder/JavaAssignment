//Pattern 13
/*
*********
*******
*****
***
*
*/

class Pattern11{
	public static void main(String args[]){
		for(int i=9;i>0;i=i-2){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}