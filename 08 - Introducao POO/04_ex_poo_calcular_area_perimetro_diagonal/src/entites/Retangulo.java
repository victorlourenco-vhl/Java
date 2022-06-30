package entites;

public class Retangulo {

	public double width;
	public double height;

	public double area() {
		return this.width   * this.height;
	}

	public double perimeter() {
		return  (2 * this.width)   + (2 * this.height);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}
	
	public String toString() {
		return String.format("AREA = %.2f\n", this.area()) +
			   String.format("PERIMETER = %.2f\n", this.perimeter()) +
			   String.format("DIAGONAL = %.2f\n", this.diagonal());
	}

}
