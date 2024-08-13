//11) Java Program to find the transpose of a given matrix

class Transpose{
	public static void main(String args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Entered Matrix : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m1[j][i]+" ");
			}
			System.out.println();
		}
	}
}