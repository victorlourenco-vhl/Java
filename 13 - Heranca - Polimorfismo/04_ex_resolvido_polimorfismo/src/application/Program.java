package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> employee = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Employee #%d data: \n", i + 1);
			System.out.print("Outsourced (y/n)? ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			if(response == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employee.add(new OutsourceEmployee(name, hours, valueHour, additionalCharge));
			}else {
				employee.add(new Employee(name, hours, valueHour));
			}
		}
		System.out.println("PAYMENTS: ");
		for(int i = 0; i < n; i++) {
			System.out.println(employee.get(i));
		}
		
		
		sc.close();
	}

}
