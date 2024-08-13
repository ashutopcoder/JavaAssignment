//MY NAME IS ABHISHEK
//ABHISHEK IS NAME MY
/*
class Demo{
	public static void main(String args[]){
		String str="MY NAME IS ABHISHEK CHAUHAN";
		String arr[] = str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
}
*/
//MY NAME IS ABHISHEK
//YM EMAN SI KEHSIHBA
/*
class Demo{
	public static void main(String args[]){
		String str="MY NAME IS ABHISHEK";
		String arr[] = str.split(" ");
		String temp = "";
		for(int i=0;i<arr.length;i++){
			for(int j=arr[i].length()-1;j>=0;j--){
				temp = temp+arr[i].charAt(j);
			}
			temp=temp+" ";
		}
		System.out.println(temp);
	}
}
*/
/*
class Demo{
	public static void main(String args[]){
		String str1="AMAN";
		String str2="KUMAR";
		str1 = str1+str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
	}
}

*/
/*
//Abc
/*
//Object Clone Using Clonable Interface :-

class Abc implements Cloneable{
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	String name="Rmesh";
	public static void main(String args[]){
		Abc obj=new Abc();
		try{
			Abc obj2=(Abc)obj.clone();
			System.out.println(obj2.name);
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
*/

//Clone Object Using class .forName
/*
class Abc{
	String name ="Raman";
	public static void main(String args[]){
		try{
		Class cls=Class.forName("Abc");
		Abc obj=(Abc)cls.newInstance();
		System.out.println(obj.name);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(InstantiationException e){
			e.printStackTrace();
		}
		catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
}

*Second Highest Occurence Character in string 
*return index of a target value of an array 
*/

//Binary SearchControls
import java.util.Scanner;
class Demo{
	public static int BinaryNum(int[] arr,int num){
		int start=0;
		int end=arr.length-1;		
		while(start<end){						
		int mid=(start+end)/2+1;
			if(num==arr[mid])
				return mid;
			if(num>arr[mid])
				start=mid;
			else
				end=mid;
		}
		return -1;
	}
	public static void main(String args[]){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number Which You Find : ");
		int num = sc.nextInt();
		int ans = BinaryNum(arr,num);
		if(ans == -1)
		System.out.println("Entered Number Is Not Present ...");
		else
		System.out.println(num+" Number is Present On Position "+(ans+1));
	}
}