package br.unicesumar.adsis4s2021.meu.pedido;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.pessoa.MeuPessoa;

@Entity
public class MeuPedido extends MeuBaseEntity{


	private Long numero;
	private Date emitidoEm;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_id")
	private List<MeuItemPedido> itens;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private MeuPessoa cliente;
	
	public MeuPedido() {

	}

	public Long getNumero() {
		return numero;
	}

	public Date getEmitidoEm() {
		return emitidoEm;
	}

	public List<MeuItemPedido> getItens() {
		return itens;
	}
	
	public MeuPessoa getCliente() {
		return cliente;
	}

}
