//Entered Year Is A Leap Year Or Not
import java.util.Scanner;
class Problem3{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Year : ");
		int num=sc.nextInt();
		if(num%4==0)
			System.out.println("Entered Year Is A Leap Year .");
		else
			System.out.println("Entered Year Is Not A Leap Year .");
			
	}
}