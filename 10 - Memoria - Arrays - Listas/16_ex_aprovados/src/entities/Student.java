package entities;

public class Student {
	private String nome;
	private double notaA;
	private double notaB;
	
	public Student(String nome, double notaA, double notaB){
		this.nome = nome;
		this.notaA = notaA;
		this.notaB = notaB;
	}
	
	public double media() {
		return (this.notaA + this.notaB) / 2;
	}
	
	public String getNome() {
		return this.nome;
	}
}
