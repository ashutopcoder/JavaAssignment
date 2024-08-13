//18) ISBN Number Java
class ISBN{
	public static void main(String args[]){
		String num="1259060977";
		int sum=0;
		int j=10;
		if(num.length()==10){
			for(int i=0;i<num.length();i++){
					sum=sum+(((int)(num.charAt(i))-48)*j);
					j--;
			}
			if(sum%11==0){
				System.out.println("ISBN Number");
			}
			else{
				System.out.println("Not ISBN Number");
			}
		}else{
			System.out.println("Number Is Not ISBN Number...!");
		}
	}
}