//Check String Is Anagram 
public class StringAnagram{
	public static boolean CheckAnagram(String s1,String s2){
		StringBuffer sb=new StringBuffer(s1);
		int count=0;
		for(int i=0;i<s2.length();i++){
			for(int j=0;j<s2.length();j++){
				if((s2.charAt(i))==(sb.charAt(j))){
					sb.setCharAt(j,'$');
					count++;
				}
			} 
		}
		if(count==s2.length())
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		String str1="LISTEN";
		String str2="SILENT";
		boolean ans=CheckAnagram(str1,str2);
		if(ans)
			System.out.print("Anagram");
		else
			System.out.print("Not Anagram");
	}
}