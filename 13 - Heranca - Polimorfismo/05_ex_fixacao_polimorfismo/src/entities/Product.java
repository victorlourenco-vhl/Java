package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
	
	public String getFormattedValue(Double value) {
		return String.format(" $ %.2f", value);
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return this.name + this.getFormattedValue(this.price);
	}
	
}
