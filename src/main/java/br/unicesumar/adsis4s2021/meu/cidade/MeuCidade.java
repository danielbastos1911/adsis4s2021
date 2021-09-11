package br.unicesumar.adsis4s2021.meu.cidade;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseEntity;

@Entity
public class MeuCidade extends MeuBaseEntity{
	private String nome;
	
	public MeuCidade() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
