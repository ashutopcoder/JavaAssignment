//12)To determine whether a given matrix is an identity matrix

class IdentityMatrix{
	public static void main(String args[]){
		int[][] m1={{1,0,0},{0,1,0},{0,0,1}};
		int flag=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j){
					if(!(m1[i][j]==1)){
						flag=1;
					}
				}else{
					if(i!=j){
						if(!(m1[i][j]==0)){
							flag=1;
						}
					}
				}
			}
		}
		if(flag==0)
			System.out.println("Matrix Is Identity ...!");
		else
			System.out.println("Matrix Is Not A Identity ...!");
	}
}