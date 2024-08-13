//Pattern 17
/*
1
12
123
1234
12345
*/
class Pattern8{
	public static void main(String args[]){
		String str="1";
		for(int i=1;i<=6;i++){
			if(i!=1){
			System.out.println(str);
			str=str+i;
			}
		}
	}
}