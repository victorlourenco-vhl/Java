package util;

public class CurrencyConverter {
	
	public static double amountToBePaid(double dollarPrice, double amountDollars) {
		double amount = dollarPrice * amountDollars;
		double tax = amount * 6 / 100;
		return amount + tax;
	}

}
