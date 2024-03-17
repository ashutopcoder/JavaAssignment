/*
 *********
  *******
   *****
    ***
     *
	 
*/
class Pattern12{
	public static void main(String args[]){
		for(int i=9;i>=1;i=i-2){
			for(int k=i;k<=9;k=k+2)
				System.out.print(" ");
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}