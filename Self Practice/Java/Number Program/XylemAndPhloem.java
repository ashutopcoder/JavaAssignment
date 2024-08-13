// 24) Xylem and Phloem Number in Java
class XylemAndPhloem{
	public static void main(String args[]){
		int num = 24248;
		int numCopy = num;
		int ph = 0;
		int xy = 0;
		while(num>0){
			if(num==numCopy)
				xy+=num%10;
			else
				if(num<10)
					xy+=num%10;
				else
					ph+=num%10;
			num=num/10;
		}
		if(ph==xy)
			System.out.println("Xylem");
		else
			System.out.println("Pholem");	
	}
}