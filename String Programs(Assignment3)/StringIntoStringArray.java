//Convert String Into String Array : 

public class StringIntoStringArray{
	public static void main(String args[]){
		String str ="MOHAN KUMAR IS A GOOD MAN";
		String[] sr=new String[8];
		String temp="";
		int m=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				temp=temp+str.charAt(i);
			}
			else{
			sr[m]=temp;
			m=m+1;
			temp="";
			}
		}
		for(int i=0;i<m;i++)
			System.out.println(sr[i]);
	}
}