package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		
		Contract contract = new Contract(number, date, value);
		
		System.out.print("Enter number of installments: ");
		int N = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(contract, N);
		
		System.out.println("Installments: ");
		
		for(Installment it: contract.getInstallments()) {
			System.out.println(it);
		}
		
		sc.close();
	}

}
