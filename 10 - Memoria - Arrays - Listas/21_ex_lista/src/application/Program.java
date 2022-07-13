package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<Employee>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Employee %d:\n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee.add(i, new Employee(id, name, salary));
			
		}
		System.out.print("Enter the employee id that have salary increase: ");
		int id = sc.nextInt();
		
		Employee employeeID = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(employeeID == null) {
			System.out.println("This id does not exist!");
		}else{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeeID.salaryIncrease(percentage);
		}
		
		/*    SOLUCAO DE ID COM FOR 
		for(int i = 0; i < employee.size(); i++) {
			if(employee.get(i).getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				employee.get(i).salaryIncrease(percentage);
				break;
			}
			if(i == employee.size() - 1 && employee.get(i).getId() != id){
				System.out.println("This id does not exist!");
			}
		} */
		
		for(Employee dataEmployee: employee) {
			System.out.println(dataEmployee.toString());
		}
		
		sc.close();
	}

}


// Soulução professor: https://github.com/acenelio/list1-java