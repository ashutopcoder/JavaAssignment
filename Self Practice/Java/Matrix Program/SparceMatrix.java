//13) To determine whether a given matrix is a sparse matrix

class SparceMatrix{
	public static void main(String args[]){
		int[][] m1={{1,2,0},{0,1,0},{0,3,0}};
		int zero=0;
		int other=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(m1[i][j]==0)
					zero++;
				else
					other++;
			}
		}
		if(zero>other)
			System.out.println("Matrix Is Sparce");
		else
			System.out.println("Matrix Is Not A Sparce");
	}
}