package entities;

public class Person {
	
	private String name;
	private int idade;
	private double altura;
	
	public Person(String name, int idade, double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
}
