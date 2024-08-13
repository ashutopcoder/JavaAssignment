//2) Java Program to Add Two Matrices
class AddMatrix{
	public static void main(String args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2={{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m1[i][j]+m2[i][j]+" ");
			}
			System.out.println();
		}
	}
}