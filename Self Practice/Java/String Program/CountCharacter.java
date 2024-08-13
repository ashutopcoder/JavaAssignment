//1) Java Program to count the total number of characters in a string 
class CountCharacter{
	public static void main(String args[]){
		String str=new String("ASHU");
		int count=0;
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println("Count : "+count);
	}
}