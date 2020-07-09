package banking;
import java.util.Scanner;

public class Bank {

	Checking checkingAccount;
	Savings savingsAccount;
	String accountType;
	
	private Bank() {
		checkingAccount = new Checking();
		savingsAccount = new Savings();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		
		System.out.println("What kind of account will you like to set up? savings or checking");
		bank.accountType = scanner.nextLine().toString().trim();		
		
		System.out.println("How much would you like to deposit?");
		Double answer = Double.parseDouble(scanner.nextLine());
		
		if(bank.accountType.equals( "savings")) {
			bank.savingsAccount.setAmount(answer);
		} else {
			bank.checkingAccount.setAmount(answer);
		}
		
		System.out.println("How much would you like to make a withdraw?");
		answer = Double.parseDouble(scanner.nextLine().trim());
		
		if(bank.accountType.equals("savings")) {
			bank.savingsAccount.withdraw(answer, "savings");
			System.out.println("Your current Balance is $" + bank.savingsAccount.getAmount());
		} else {
			bank.checkingAccount.withdraw(answer, null);
			System.out.println("Your current Balance is $" + bank.checkingAccount.getAmount());
		}
		
		
		if(bank.accountType.equals("checking")) { 
			bank.checkingAccount.setOverDraftFees();
			
			System.out.println("Your overdraft fees are $" + bank.checkingAccount.getOverDraftFees());
		}
		
		scanner.close();
		
	}

}
