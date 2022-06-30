package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product productA = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Product: ");
		productA.name = sc.nextLine();// Só o next() pega apenas a primeira palavra
		System.out.print("Price: ");
		productA.price = sc.nextDouble();
		System.out.print("Quantity: ");
		productA.quantity = sc.nextInt();

		// Não é necessário utilizar o .toString()
		
		System.out.println("Product data: " + productA);
		System.out.print("Enter the number of products to be added in stock: ");
		productA.addProducts(sc.nextInt());
		
		System.out.println("Updated data: " + productA);
		System.out.print("Enter the number of products to be removed in stock: ");
		productA.removeProducts(sc.nextInt());
		
		System.out.println("Updated data: " + productA);
		
		sc.close();

	}

}
