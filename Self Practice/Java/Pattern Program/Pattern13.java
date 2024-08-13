//Pattern13
class Pattern13{
	public static void main(String args[]){
		String str="*";
		for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--)
				System.out.print(" ");
			if(i!=1){
				str="*"+str+"*";
			}
			System.out.println(str);
		}
	}
}