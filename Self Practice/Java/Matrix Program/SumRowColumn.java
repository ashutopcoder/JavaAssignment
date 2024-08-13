//10)find the sum of each row and each column of a matrix

class SumRowColumn{
	public static void main(String args[]){
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int rows=a.length;
		int cols=a[0].length;
		for(int i=0;i<rows;i++){
			int sumrow=0;
			for(int j=0;j<cols;j++){
				sumrow+=a[i][j];
			}
			System.out.println("Sum Of "+(i+1)+" Row Is :"+sumrow);
		}
		
		for(int i=0;i<rows;i++){
			int colsum=0;
			for(int j=0;j<cols;j++){
				colsum+=a[j][i];
			}
			System.out.println("Sum Of "+(i+1)+" Column Is :"+colsum);
		}
	}
}