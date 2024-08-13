class RemoveSpacesSpecialCharacter{
	public static void main(String args[]){
		String str="MY NAME IS MOHAN";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' '){
				sb.setCharAt(i,'$');
			}
		}
		for(int m=0;m<sb.length();m++){
			System.out.print(sb.charAt(m));
		}
	}
}