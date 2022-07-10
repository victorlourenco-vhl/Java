package entities;

public class Person {
	
	private double altura;
	private char genero;
	
	public Person(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public double getGenero() {
		return this.genero;
	}
	

}
