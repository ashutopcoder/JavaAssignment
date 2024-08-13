//17) Evil Number Java
class EvilNumber{
	public static void main(String args[]){
		int num=27;
		System.out.println("Number is : "+num);
		String str = "";
		for(int i=0;i<num;num=num/2)
			str=num%2+str;
		System.out.println("Binary is : "+str);
		int count=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)=='1')
				count++;
		if(count%2==0)
			System.out.println("Evil Number");
		else
			System.out.println("Not Evil Number");
	}
	
}