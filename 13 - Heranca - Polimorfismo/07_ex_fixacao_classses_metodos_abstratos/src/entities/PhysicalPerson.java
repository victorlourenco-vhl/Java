package entities;

public class PhysicalPerson extends Person{
	
	private double healthExpenditures;

	public PhysicalPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public final Double taxes() {
		if (this.getAnnualIncome() < 20000.00) {
			return ( this.getAnnualIncome() - (this.healthExpenditures / 2) ) * 0.15;
		}
		else {
			return ( this.getAnnualIncome() * 0.25) - (this.healthExpenditures / 2);
		}
	}
	
}
