//pattern18
/*
    *
   ***
  *****
 ********
**********

*/
class Pattern7{
	public static void main(String args[]){
		for(int i=0;i<=9;i=i+2){
			for(int j=9;j>i;j=j-2){
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}