//6) Java Program to display the lower triangular matrix

class LowerTringularMatrix{
	public static void main(String args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i<j){
					System.out.print(0+" ");
				}else{
					System.out.print(m1[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}