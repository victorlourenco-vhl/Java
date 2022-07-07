package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double initialDeposit;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String nameHolder = sc.next();
		System.out.print("Is there a initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		if(option == 'y') {
			System.out.print("Enter initial de deposit value: ");
			initialDeposit = sc.nextDouble();
		}else {
			initialDeposit = 0.0;
		}
		
		BankAccount account = new BankAccount(accountNumber, nameHolder, initialDeposit);
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		account.accountDeposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		account.accountWithdrawal(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
		
	}

}
