//MinMaxOccuringCharacter
class MinMaxOccuringCharacter{
	public static char Maximum(String str){
		char c=' ';
		int len=0;
			for(int i=0;i<str.length();i++){
				int count=0;
				for(int j=i+1;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						count++;
					}
				}
				if(count>len){
					len=count;
					c=str.charAt(i);
				}
			}
				return c;
		}
		public static char Minimum(String str){
			char ch=' ';
			int len=str.length();
			for(int i=0;i<str.length();i++){
				int count=0;
				for(int j=i+1;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						count++;
					}	
				}
				if(count<len){
						len=count;
						ch=str.charAt(i);
					}
			}
			return ch;
		}
	public static void main(String args[]){
		String str="ABCAACWESSTSSWQSS";
		char max=Maximum(str);
		char min=Minimum(str);
		System.out.println("Maximum Occuring Character : "+max);
		System.out.println("Minimum Occuring Character : "+min);
	}
}