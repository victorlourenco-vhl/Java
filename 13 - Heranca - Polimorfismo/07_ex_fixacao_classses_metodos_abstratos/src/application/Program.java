package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> person = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numberOfPayers = sc.nextInt();
		
		
		
		for (int i = 1; i <= numberOfPayers; i++) {
			System.out.println("Tax payer #" + i + "data: ");
			System.out.print("Individual or company (i/c)? ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(response == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				person.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
			}
			else if(response == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				person.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			}
			else {
				System.out.print("Invalid answer!");
			}
		}
		double totalTaxes = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Person individual: person) {
			System.out.println(individual.toString());
			totalTaxes += individual.taxes();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", totalTaxes);

	}

}
