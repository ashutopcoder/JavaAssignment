//String Sort
public class SortString{
	public static void main(String args[]){
		String str="ABHISHEK";
		StringBuffer sb =new StringBuffer(str);
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if((sb.charAt(i))>(sb.charAt(j))){
					char ch=sb.charAt(i);
					sb.setCharAt(i,sb.charAt(j));
					sb.setCharAt(j,ch);
				}
			}
		}
		str=sb.toString();
		System.out.println(str);
	}
}