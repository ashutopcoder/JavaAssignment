class SphenicNumber{
	public static boolean Prime(int num){
		if(num==1)
			return false;
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				return false;
		return true;
	}
	public static void main(String args[]){
		for(int n=30;n<=1000;n++)
		{
			int num = n;
			int copy = num;
			int m = 0;
			int arr[] = new int[2];
			for(int x=2;x<=num;x++){
				if(Prime(x)){
					if(num%x==0){
						arr[m++] = x;
						num=num/x;
					}
				}
				if(m==2)
					break;
			}
			if(Prime(num)){
				if(copy==(arr[0]*arr[1]*num))
					System.out.println(arr[0]+" * "+arr[1]+" * "+num+" = "+(arr[0]*arr[1]*num));
			}
		}
	}
}