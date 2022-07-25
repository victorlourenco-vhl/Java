package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	

	public UsedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedProduct(String name, Double price, Date manufactoreDate) {
		super(name, price);
		this.manufactureDate = manufactoreDate;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " (used)" + this.getFormattedValue(this.getPrice()) 
				+ " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
}
