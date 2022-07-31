package model.entities;

import model.exeptions.AccountException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws AccountException {
		if(amount > this.balance) {
			throw new AccountException("Withdraw error: Not enough balance");
		}
		else if(amount > this.withdrawLimit) {
			throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
		}
		this.balance -= amount;
	}
	
	public String updateBalance() {
		return String.format("New blance: %.2f", this.balance);
	}

}
