package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;

	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Double subTotal() {
		return this.quantity * this.price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
