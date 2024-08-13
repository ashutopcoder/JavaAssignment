//RemoveDuplicate

class RemoveDuplicate{
	public static void main(String args[]){
		String str=new String("RAMAN");
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)!='$'){
				for(int j=i+1;j<sb.length()-1;j++){
					if(sb.charAt(i)==sb.charAt(j)){
						sb.setCharAt(j,'$');
					}
				}
			}
		}
		for(int m=0;m<sb.length();m++){
			if(sb.charAt(m)!='$'){
				System.out.print(sb.charAt(m));
			}
		}
	}
}