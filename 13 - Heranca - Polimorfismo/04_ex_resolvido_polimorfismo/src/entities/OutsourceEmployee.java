package entities;

public class OutsourceEmployee extends Employee{
	
	private Double additionalCharge;

	public OutsourceEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final Double payment() {
		return super.payment() + (this.additionalCharge * 1.1);
	}
}
