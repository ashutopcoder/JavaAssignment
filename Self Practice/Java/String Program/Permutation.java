

class Permutation{
	public static void main(String args[]){
		String str=new String("MY NAME IS ABHISHEK.CHUHN,ND$");
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(!((((int)str.charAt(i)>64)&&((int)str.charAt(i)<91))||(str.charAt(i)==' ')))
				count++;
		}
		System.out.println("Number of Special Characters : "+count);
	}
}