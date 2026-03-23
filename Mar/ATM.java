import java.util.Scanner;

public class ATM{
	public static void main(String args[]){
		int Balance = 70000;
		int pin=1234;
		boolean nextTransaction=true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your pin:");
		int enterdPin=sc.nextInt();
		
		
		while (true){
			System.out.println("___ATM MENU___");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw Cash");
			System.out.print("Choose option :");
			
			
			int amount = sc.nextInt();
			
			switch(amount){
				case 1:
					System.out.println("Check Balance :"+ Balance);
					break;
				case 2:
					System.out.print("Enter Deposit Amout  :");
					int Deposit = sc.nextInt();
					if (Deposit > 0){
						Balance += Deposit;
						System.out.println();
					}else{
						System.out.print("invalid deposit!");
					}
					break;
				case 3:
					System.out.print("withdrawal ammount!:");
					int withdraw = sc.nextInt();
					if(withdraw > 0){
						Balance =Balance - withdraw;
						System.out.println("Please take your cash.Remaining:Rs."+ Balance);
						
			       }else{
					   System.out.print("Transaction Declined.");
				   }
				   break;
			
			}
			System.out.print("do you want to anouther transaction?(1 For Yes,0 For No):");
			int cont=sc.nextInt();
			if(cont==0){
				nextTransaction=false;
				System.out.println("thank you! Have a nice day.");
				break;
			}	
			
		}
	}
}