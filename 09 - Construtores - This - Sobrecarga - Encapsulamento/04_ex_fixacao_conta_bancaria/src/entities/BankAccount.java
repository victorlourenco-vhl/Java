package entities;

public class BankAccount {
	
	private int numberAccount;
	private String nameAccountHolder;// titular da conta
	private double accountBalance; // saldo da conta
	
	public BankAccount(){

	}
	public BankAccount(int numberAccount, String nameAccountHolder){
		this.numberAccount = numberAccount;
		this.nameAccountHolder = nameAccountHolder;
	}
	
	public BankAccount(int numberAccount, String nameAccountHolder, double initialDeposit){
		this.numberAccount = numberAccount;
		this.nameAccountHolder = nameAccountHolder;
		this.accountDeposit(initialDeposit);
	}
	
	// Getters e Setters
	
	public int getNumberAccount() {
		return this.numberAccount;
	}
	
	public String getNameAccountHolder() {
		return this.nameAccountHolder;
	}

	public void setNameAccountHolder(String name) {
		this.nameAccountHolder = name;
	}
	
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	public void accountDeposit(double deposit) {
		this.accountBalance += deposit;
	}
	
	public void accountWithdrawal(double withdrawal) {
		this.accountBalance = this.accountBalance - withdrawal - 5;
	}
	
	public String toString() {
		return "Account " + this.numberAccount
			 + ", Holder: " + this.nameAccountHolder
			 + String.format(", Balance: $ %.2f", this.getAccountBalance());
	}
}
