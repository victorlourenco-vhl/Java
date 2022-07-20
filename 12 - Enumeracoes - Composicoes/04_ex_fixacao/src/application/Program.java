package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in );
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(nome, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int quantity  = sc.nextInt();
		
		
		
		
		for(int i = 0; i < quantity; i++) {
			System.out.printf("Enter #%d item data: \n", i+1);
			System.out.print("Product name: ");
			String productName = sc.next();       
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(it);	
		}
		System.out.println();
		System.out.println(order);
		
		
		sc.close();
		
		
	}

}
