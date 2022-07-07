package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Construtor padr�o
	public Product() {
		
	}
	// Construtor personalizado 1
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// Construtor personalizado 2

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
					+ String.format("%.2f", price) 
					+ ", " + quantity + " units, Total: $ "
					+ String.format("%.2f", totalValueInStock());
	}
}