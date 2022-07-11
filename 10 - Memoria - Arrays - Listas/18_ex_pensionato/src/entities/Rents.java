package entities;

public class Rents {
	private String nome;
	private String email;
	private int room;
	
	public Rents(String nome, String email, int room) {
		this.nome = nome;
		this.email = email;
		this.room = room;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getEmail() {
		return this.email;
	}
	public int getRoom() {
		return this.room;
	}
	
	public String toString() {
		return String.format("%d: ", this.getRoom()) + this.getNome() + ", " + this.getEmail();  
	}
}
