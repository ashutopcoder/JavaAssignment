/*
0 
909 
89098 
7890987 
678909876 
56789098765 
4567890987654 
345678909876543 
23456789098765432 
1234567890987654321
*/

class Pattern5{
	public static void main(String args[]){
		String str="0";
		for(int i=10;i>=1;i--){
			if(i!=10)
				str=i+str+i;
			System.out.println(str);
		}
	}
}