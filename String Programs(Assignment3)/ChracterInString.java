//Program to Get a Character From the Given String

import java.util.Scanner;
public class ChracterInString{
	public static void main(String args[]){
		String str="RAMANKUMAR";
		Scanner sc=new Scanner(System.in);
		System.out.print("Which Indexing Value You Want To Print : ");
		int num=sc.nextInt();
			System.out.print(str.charAt(num-1));
	}
}