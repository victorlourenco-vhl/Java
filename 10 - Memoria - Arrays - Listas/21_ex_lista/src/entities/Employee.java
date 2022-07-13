package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void salaryIncrease(double percentage) {
		this.salary += (this.salary * percentage / 100);
	}
	
	public Integer getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Double getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return this.id + ", " + this.name
			 + ", " + String.format("%.2f", this.salary);
	}
}
