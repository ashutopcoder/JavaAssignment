//11) ATM program Java
import java.util.Scanner;
class ATM{
	private int amt;
	ATM(int amt){
		this.amt=amt;
	}
	public void Deposit(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount To Deposit : ");
		int dep=sc.nextInt();
		this.amt=this.amt+dep;
		System.out.println("Deposit Success.");
	}
	
	public void Withdrawl(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Amount To Withdrawl : ");
			int with=sc.nextInt();
		if(with<this.amt){
			this.amt = this.amt-with;
			System.out.println("Withdrawl Success.");
		}
		else
			System.out.println("Insufficient Balance");
	}
	public void CheckBalance(){
		System.out.println("Check Balance : "+this.amt);
	}
	public static void main(String args[]){
		ATM cus1 = new ATM(15000);
		ATM cus2 = new ATM(34000);
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 To Deposit : ");
		System.out.println("Enter 2 To Withdrawl : ");
		System.out.println("Enter 3 To CheckBalance : ");
		System.out.println("Enter 4 To Exit : ");
		System.out.println("Enter Your Choice : ");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
					cus2.Deposit();
					break;
			case 2:
					cus2.Withdrawl();
					break;
			case 3:
					cus2.CheckBalance();
					break;
			case 4:
					System.out.println("ThankYou Using ATM");
					System.exit(0);
			default:
					System.out.println("Wrong Enter...!");
		}
		}
		
	}
}