package entities;

public class Employee {
	public String name;
	// Sal�rio bruto
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	public void increaseSalary(double percentage) {
		this.grossSalary += this.grossSalary * percentage/100;
	}
	public String toString() {
		return this.name + String.format(", $ %.2f", netSalary());
	}
}
