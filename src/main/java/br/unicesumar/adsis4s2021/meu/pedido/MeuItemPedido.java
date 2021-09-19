package br.unicesumar.adsis4s2021.meu.pedido;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.produto.Produto;

@Entity
public class MeuItemPedido {
	@Id
	private String id;
	private BigDecimal precoUnitario;
	private BigDecimal percentualDeDesconto;
	private BigDecimal quantidade;
	
	@ManyToOne
	private Produto produto;

	public MeuItemPedido() {
	}

	public String getId() {
		return id;
	}

	public BigDecimal getPercentualDeDesconto() {
		return percentualDeDesconto;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}

}
