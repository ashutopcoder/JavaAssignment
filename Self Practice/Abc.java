


//-----------------------------String Programs---------------------------------


/*
//CheckIndex Of Entered Number 

import java.util.Scanner;
class Abc
{
	public static void CheckIndex(int[] arr,int num){
		int flag=0;
		int i;
		for(i=0;i<arr.length;i++){
			if(arr[i]==num){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Index Of Entered Number Is "+(i+1));
		}
		else{
			System.out.println("Entered Number Is Not present In Array ...!");
		}
	}
    public static void main(String arg[])
    {
		int[] arr={1,3,2,5,4,8,76,9,0,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number Which Number You Find : ");
		int num=sc.nextInt();
		CheckIndex(arr,num);
    }
}

*/
/*
//Count Character In String : 

class Abc
{
    public static void main(String args[])
    {
		String str="ABCDFE";
		int count=0;
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println(count);
    }
}
*/

/*
//Strings Are Anagram Or Not 

class Abc{
	public static void main(String args[]){
		String s1="LISTEN";
		String s2="SILENT";
		int count=0;
		if(s1.length()==s2.length()){
		StringBuffer sb=new StringBuffer(s1);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)!='$'){
				for(int j=0;j<sb.length();j++){
					if(sb.charAt(i)==s2.charAt(j)){
						sb.setCharAt(i,'$');
						count++;
					}
				}
			}
		}
		if(count==s2.length())
			System.out.println("Strings Are Anagram");
		else
			System.out.println("Strings Are Not Anagram");
		}
		else
			System.out.println("String Mismatched");
	}
}
*/

/*
//Divide In Equal Parts..

import java.util.Scanner;
class Abc{
	public static void main(String args[]){
		String str="ABCDEFGHIJKLM";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Parts : ");
		int num=sc.nextInt();
		int len=str.length()/num;
		int m=0;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=len;j++){
			System.out.print(str.charAt(m));
			m++;
			}
			System.out.println();
		}
	}
}
*/
/*
//Remove White Spaces
class Abc{
	public static void main(String args[]){
		String str="I am Abhishek Chauhan.";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				System.out.print(str.charAt(i));
			}
		}
	}
}
*/

/*
//LowerCase To UpperCase And UpperCase To LowerCase (vice-versa).
class Abc{
	public static void main(String args[]){
		String str="AbhishekChauhan";
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)>=97)
				System.out.print((char)(str.charAt(i)-32));
			else
				System.out.print((char)(str.charAt(i)+32));
		}
	}
}
*/
/*
//Remove Space With Special Character

import java.util.Scanner;
class Abc{
	public static void main(String args[]){
	String str="Abhishek Chauhan";
	System.out.println("Entered String : "+str);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Special Character : ");
	char ch=sc.next().charAt(0);
	StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' ')
				sb.setCharAt(i,ch);
		}
		System.out.println(sb);
	}
}
*/

/*
//Check Rotation 
class Abc{
	public static void main(String args[]){
		String str=new String("ABCD");
		String str1=new String("CDAB");
		String temp=str+str;
		if(temp.indexOf(str1)!=-1)
			System.out.println("Strings are In Rotation .");
		else
			System.out.println("Strings are Not In Rotation .");
	}
}
*/

/*

//MAximum Occuring Character And Minimum Occuring Character 

class Abc{
	public static char Maximum(String str){
		int len=0;
		char ch=' ';
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
			if(count>len){
				len=count;
				ch=str.charAt(i);
			}
		}
		return ch;
	}

	public static char Minimum(String str){
		int len=str.length();
		char ch=' ';
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
			if(count<len){
				len=count;
				ch=str.charAt(i);
			}
			
		}
		return ch;
	}
	public static void main(String args[]){
		String str="AABAACCC";
		char max=Maximum(str);
		char min=Minimum(str);
		System.out.println("Maximum Character : "+max);
		System.out.println("Minimum Character : "+min);
	}
}

*/
//Duplicate Character In A String 
/*
class Abc{
	public static void main(String args[]){
		String str="ABCAAB";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			int count=0;
			if(sb.charAt(i)!='$'){
				for(int j=i+1;j<sb.length();j++){
					if(sb.charAt(i)==sb.charAt(j)){
						sb.setCharAt(j,'$');
						count++;
					}
				}
				if(count>0)
				System.out.println("Repeating Character : "+sb.charAt(i));
			}
		}
	}
}
*/

//Duplicate Word In String 
/*
class Abc{
	public static void main(String args[]){
		String str="Ram Is A Good Boy And Ram Is A Boy";
		int flag=0;
		String[] sr=str.split(" ");
		for(int i=0;i<sr.length;i++){
			for(int j=i+1;j<sr.length;j++)
				if(sr[i].equals(sr[j]))
					System.out.println("Repeating Word : "+sr[i]);
		}
	}
}
*/

// Frequency Of Character In String :
/*
class Abc{
	public static void main(String args[]){
		String str="ABCAABABB";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)!='$'){
				int count=1;
				for(int j=i+1;j<sb.length();j++){
					if(sb.charAt(i)==sb.charAt(j)){
						count++;
						sb.setCharAt(j,'$');
					}
				}
				System.out.println("Character : "+sb.charAt(i)+" "+count+" Times.");
			}
		}
	}
}
*/

//Largest And Smallest Word In String 
/*
class Abc{
	public static String MaximumStr(String str){
		String[] sr=str.split(" ");
		String max=sr[0];
		for(int i=0;i<sr.length;i++){
			if(max.length()<sr[i].length())
				max=sr[i];
		}
		return max;
	}
	public static String MinimumStr(String str){
		String[] sr=str.split(" ");
		String min=sr[0];
		for(int i=0;i<sr.length;i++){
			if(min.length()>sr[i].length())
				min=sr[i];
		}
		return min;
	}
	public static void main(String args[]){
		String str="MOHAN IS A GOOD BOY";
		String max=MaximumStr(str);
		String min=MinimumStr(str);
		System.out.println("Maximum Length String : "+max);
		System.out.println("Minimum Length String : "+min);
	}
}
*/

//Swap Two String Without Using Third Variable....
/*
class Abc{
	public static void main(String args[]){
		String s1="Mohan";
		String s2="Kumar";
		System.out.println("First String: "+s1);
		System.out.println("Second String : "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("--------------");
		System.out.println("First String: "+s1);
		System.out.println("Second String : "+s2);
		
	}
}
*/


/*
//String Reverse Word By Word 
//MOHAN IS A GOOD BOY
//NAHOM SI A DOOG YOB

class Abc{
	public static void main(String args[]){
	String str="MOHAN IS A GOOD BOY";
	String[] sc=str.split(" ");
	String temp=" ";
		for(int i=0;i<sc.length;i++){
			for(int j=sc[i].length()-1;j>=0;j--){
				temp+=sc[i].charAt(j);
			}
			temp+=" ";
			
		}
		System.out.println(temp);
	}
}
*/
/*
//Reverse String Without using Reverse()
//ABHISHEK IS A GOOD BOY
//BOY GOOD A IS ABHISHEK
class Abc{
	public static void main(String args[]){
		String str="ABHISHEK IS A GOOD BOY";
		String[] sp=str.split(" ");
		for(int i=sp.length-1;i>=0;i--){
			System.out.print(sp[i]+" ");
		}
	}
}
*/
