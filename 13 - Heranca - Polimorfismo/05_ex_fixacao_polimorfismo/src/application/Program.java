package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> product = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1 )+ " data:");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date dateManufacture = sdf.parse(sc.next());
				product.add(new UsedProduct(name, price, dateManufacture));
			}
			else if(type == 'i') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, fee));
			}
			else {
				product.add(new Product(name, price));
			}
		}
		
		for(Product p: product) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
