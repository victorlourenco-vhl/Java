package application;

import java.util.Scanner;

import model.entities.Account;
import model.exeptions.AccountException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Innitial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			
			Account myAccount = new Account(number, holder, balance, limit);
		
			System.out.print("Enter the amount for withdraw: ");
			double amount = sc.nextDouble();
			myAccount.withdraw(amount);
			System.out.println(myAccount.updateBalance());
		}
		
		catch(AccountException e) {
			System.out.println(e.getMessage());;
		}
		
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
		sc.close();

	}

}
