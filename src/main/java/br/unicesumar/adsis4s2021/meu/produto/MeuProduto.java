package br.unicesumar.adsis4s2021.meu.produto;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseEntity;

@Entity
public class MeuProduto extends MeuBaseEntity {

	private String nome;
	private double preco;

	public MeuProduto() {

	}

	public MeuProduto(String nome, double preco) {

		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

}
