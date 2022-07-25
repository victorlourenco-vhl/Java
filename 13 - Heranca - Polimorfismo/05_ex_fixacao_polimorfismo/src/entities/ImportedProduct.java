package entities;

public class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return this.getName() + this.getFormattedValue(this.totalPrice()) 
				+ String.format(" Customs fee: $ %.2f", this.customsFee);
	}
	
	public Double totalPrice() {
		return this.getPrice() + this.customsFee;
	}
	
}
