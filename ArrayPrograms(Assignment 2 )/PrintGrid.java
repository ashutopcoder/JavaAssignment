/*Print A Grid
Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  

*/

public class PrintGrid{
	public static void main(String args[]){
		for(int i=0;i<=10;i++){
			for(int j=0;j<=10;j++){
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}