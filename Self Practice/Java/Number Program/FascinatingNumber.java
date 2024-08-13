//7) Fascinating Number in Java

class FascinatingNumber{
	public static void main(String args[]){
		int num=192;
		String finalnum = num+""+num*2+""+num*3;
		int num2=Integer.parseInt(finalnum);
		int count = 0;
		for(int i=1;i<=9;i++){
			int num1=num2;
			for(int j=0;j<num1;num1=num1/10){
				int rem = num1%10;
				if(rem==i){
					count++; break;}
			}
		}
		if(count==9)
			System.out.println("FascinatingNumber");
		else
			System.out.println("Not FascinatingNumber");
	}
}