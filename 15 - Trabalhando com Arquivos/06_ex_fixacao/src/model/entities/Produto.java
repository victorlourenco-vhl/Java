package model.entities;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Produto() {
		super();
	}

	public Produto(String nome, Double preco, Integer quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	public Double valorTotal() {
		return this.quantidade * this.preco;
	}
	
	@Override
	public String toString() {
		return this.nome + "," + this.valorTotal();
	}
	
}
