package entities;

public class Student {
	public String name;
	public double notaA;
	public double notaB;
	public double notaC;
	
	public double finalGrade() {
		return  this.notaA + this.notaB + this.notaC;
	}
	
	public double missingPoints() {
		return 60 - this.finalGrade();
	}
	
	public String studentStatus() {
		if (this.finalGrade() >= 60) {
			return "PASS";
		}
		else {
			return "FAILED\n" + String.format("MISSING %.2f POINTS", this.missingPoints());
		}
	}
	
	public String toString() {
		return String.format("FINAL GRADE: %.2f\n", this.finalGrade())
			   + studentStatus();
	}
}
