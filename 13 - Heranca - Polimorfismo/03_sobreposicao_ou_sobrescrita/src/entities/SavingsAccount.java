package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double intestRate) {
		super(number, holder, balance);
		this.interestRate = intestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		this.balance += this.balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	
}
