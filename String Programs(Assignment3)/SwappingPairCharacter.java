/*Swapping Pair of Characters
HINT: HELLOINDIA
EHLLIODNAI
*/
public class SwappingPairCharacter{
	public static void main(String args[]){
		String str ="HELLOINDIA";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<str.length()-1;i=i+2){
			char ch=sb.charAt(i);
			sb.setCharAt(i,sb.charAt(i+1));
			sb.setCharAt(i+1,ch);
		}
		str=sb.toString();
		System.out.print(str);
	}
}