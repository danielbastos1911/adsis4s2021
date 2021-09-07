package br.unicesumar.adsis4s2021.meu.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos-meu")
public class MeuPedidoController {
	@Autowired
	private MeuPedidoRepository repo;

	@GetMapping
	public List<MeuPedido> get() {
		return repo.findAll();
	}

	@PostMapping
	public String post(@RequestBody MeuPedido novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			throw new RuntimeException("Seu PEDIDO já existe, faça um PUT em vez de POST!");
		}
		novo = repo.save(novo);
		return novo.getId();
	}

}
