/*
12344321
123**321
12****21
1******1
*/

class Pattern6{
	public static void main(String[] args){
		int m=5;
		for(int k=1;k<=4;k++){
		for(int i=1;i<=4;i++){
			if(i>=m)
			System.out.print("*");
			else
			System.out.print(i);
			}
			for(int j=4;j>=1;j--){
				if(j>=m)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
			m--;
			}
	}
}