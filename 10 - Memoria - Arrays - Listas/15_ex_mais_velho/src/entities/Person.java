package entities;

public class Person {
	private String nome;
	private int idade;
	
	public Person(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
}
