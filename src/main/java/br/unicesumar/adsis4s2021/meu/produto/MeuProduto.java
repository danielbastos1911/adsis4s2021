package br.unicesumar.adsis4s2021.meu.produto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.categoria.MeuCategoria;

@Entity
public class MeuProduto extends MeuBaseEntity {

	private String nome;
	private double preco;
	@ManyToOne
	private MeuCategoria categoria;
	
	public MeuProduto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public MeuCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(MeuCategoria categoria) {
		this.categoria = categoria;
	}

	

}
