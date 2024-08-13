//12) Autobiographical Number in Java

class AutoBiographical{
	public static void main(String args[]){
		int num1=1210;
		//       0123
		String str = num1+"";
		int count = str.length();
		int[] arr=new int[count];
			for(int j=arr.length-1;j>=0;j--,num1=num1/10){
				arr[j]=num1%10;
			}
			int flag=1;
			for(int m=0;m<arr.length;m++){
				count=0;
				for(int i=0;i<arr.length;i++)
					if(m==arr[i])
						count++;
				if(arr[m]!=count)
					flag=0;
			}
			if(flag==1)
				System.out.print("AutoBiographical");
			else
				System.out.print("Not AutoBiographical");
	}
}