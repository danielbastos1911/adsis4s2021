package br.unicesumar.adsis4s2021.meu.categoria;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseEntity;

/* Criar uma categoria vinculada ao produto.
Usar como base a Cidade, com controller e repo...
O produto estará vinculado a uma categoria
Associação igual a endereço com cidade. manyToOne;
*/

@Entity
public class MeuCategoria extends MeuBaseEntity{
	private String nome;
	
	public MeuCategoria() {
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
