// test if an array contains a specific value
public class SpecificValueArray{
	public static void main(String args[]){
		char[] ch={'a','b','c','d','e','w','$','t','r','i'};
		int flag=1;
		for(int i=0;i<ch.length;i++)
		{
			if(!(((int)ch[i]>=97)&&((int)ch[i]<=122))){
				System.out.print("Specific Value Found "+ch[i]+" on index "+(i+1));
				flag=0;
			}
		}
		if(flag==1)
			System.out.println("Specific Value Not Found");
	}
}