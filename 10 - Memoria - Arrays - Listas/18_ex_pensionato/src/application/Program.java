package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rents;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		
		System.out.print("How many rooms will be rented? ");
		int renteds = sc.nextInt();
		
		Rents quartos[] = new Rents[10];
		
		for(int i = 0; i < renteds; i++) {
			System.out.printf("Rent #%d:\n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int numero = sc.nextInt();
			quartos[numero - 1] = new Rents(nome, email, numero);			
		}
		System.out.println("Busy rooms:");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i]);
			}
		}
		
		sc.close();

	}

}
