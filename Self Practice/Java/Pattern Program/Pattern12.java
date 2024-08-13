//Pattern 12
/*
1 1 1 1 1 1 1 1 1 1
1                 1
1                 1
1                 1
1                 1
1                 1
1                 1
1                 1
1                 1
1 1 1 1 1 1 1 1 1 1
*/
class Pattern12{
	public static void main(String args[]){
		for(int i=1;i<=10;i++){
			System.out.print(1+" ");
		}
		System.out.println();
		for(int j=1;j<=8;j++){
			for(int i=1;i<=10;i++){
				if((i==1)||(i==10)){
					System.out.print(1+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++){
			System.out.print(1+" ");
		}
		System.out.println();
	}
}