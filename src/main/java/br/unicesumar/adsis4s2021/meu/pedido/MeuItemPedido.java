package br.unicesumar.adsis4s2021.meu.pedido;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.produto.MeuProduto;

@Entity
public class MeuItemPedido {

	@Id
	private String id;
	private BigDecimal precoUnitário;
	private BigDecimal percentualDesconto;
	private BigDecimal quantidade;

	@ManyToOne
	private MeuProduto produto; // associação!!

	public MeuItemPedido() {

	}

	public String getId() {
		return id;
	}

	public BigDecimal getPrecoUnitário() {
		return precoUnitário;
	}

	public BigDecimal getPercentualDesconto() {
		return percentualDesconto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public MeuProduto getProduto() {
		return produto;
	}

}
