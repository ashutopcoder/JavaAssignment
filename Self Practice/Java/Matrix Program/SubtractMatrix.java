//4) Java Program to subtract the two matrices

class SubtractMatrix{
	public static void main(String args[]){
		int[][] m1={{10,20,30},{40,50,60},{70,80,90}};
		int[][] m2={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m1[i][j]-m2[i][j]+" ");
			}
			System.out.println();
		}
	}
}