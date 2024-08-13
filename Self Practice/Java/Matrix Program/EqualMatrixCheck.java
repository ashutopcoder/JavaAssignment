//5) Java Program to determine whether two matrices are equal

class EqualMatrixCheck{
	public static void main(String args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2={{1,2,3},{4,5,6},{7,8,9}};
		int flag=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(!(m1[i][j]==m2[i][j]))
					flag=1;
			}
		}
		if(flag==0)
			System.out.println("Both Matrix Are Equal");
		else
			System.out.println("Both Matrix Are Different");
	}
}