//String Is Pangram Or Not: 
public class PangramString{
	public static void main(String args[]){
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int count=0;
		int flag=0;
		for(int j=65;j<=90;j++){
			for(int i=0;i<str.length();i++){
				if((int)str.charAt(i)==j)
				{
					count++;
					break;
				}
			}
			
		}
		if(count==26)
			System.out.print("Strings Are Pangram");
		else
			System.out.print("String Are Not PAngram");
	}
}