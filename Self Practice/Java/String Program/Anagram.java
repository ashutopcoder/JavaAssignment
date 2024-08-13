//ANAGRAM

class Anagram{
	public static boolean checkAngram(String str1,String str2){
		if(str1.length()==str2.length()){
			int count=0;
			StringBuffer sb=new StringBuffer(str1);
			for(int i=0;i<sb.length();i++){
				for(int j=0;j<str2.length();j++){
					if(sb.charAt(i)==str2.charAt(j)){
						sb.setCharAt(i,'$');
						count++;
						break;
					}
				}
			}
				if(str1.length()==count){
					return true;
				}
				else{
					return false;
				}
		}
		return false;
	}
	public static void main(String args[]){
		String str1=new String("LISTEN");
		String str2=new String("SILENT");
		if((checkAngram(str1,str2))){
			System.out.println("Strings Are Anagram...!");
		}else{
			System.out.println("Strings Are Not Anagram...!");
		}
	}
}