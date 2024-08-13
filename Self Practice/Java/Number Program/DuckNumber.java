//16) Duck Number Java

class DuckNumber{
	public static void main(String args[]){
		int num=1560;
		int flag=0;
		for(int i=0;i<num;num=num/10){
			if(num%10==0){
			flag=1;
			count++;
			}
	}
	if(flag==1){
		System.out.println("Duck Number");
	}
	else{
		System.out.println("Number Is Not Duck Number");
		}
}
}