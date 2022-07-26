package entities;

public class LegalPerson extends Person{
	
	private Integer numberEmployees;

	public LegalPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public final Double taxes() {
		if (this.numberEmployees > 10) {
			return this.getAnnualIncome() * 0.14;
		}else {
			return this.getAnnualIncome() * 0.16;
		}
	}
	
	
	
}
