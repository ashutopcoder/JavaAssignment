//Reverse A String Using stack
import java.util.Stack;
public class ReverseUsingStack{
	public static void main(String args[]){
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str2="";
		Stack<Character> st = new Stack<Character>();
		//Push To Stack
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		//Pop From Stack
		for(int i=0;i<str.length();i++)
			str2=str2+st.pop();
		
		System.out.println(str2);
		
	}
}