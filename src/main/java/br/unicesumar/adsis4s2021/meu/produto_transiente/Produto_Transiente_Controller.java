package br.unicesumar.adsis4s2021.meu.produto_transiente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos-tmeu")
public class Produto_Transiente_Controller {
	private List<Produto_Transiente> produtos = new ArrayList<>();

	public Produto_Transiente_Controller() {
		produtos.add(new Produto_Transiente("1", "Arroz", 20.00));
		produtos.add(new Produto_Transiente("2", "Feijao", 10.00));
		produtos.add(new Produto_Transiente("2", "Macarrao", 3.00));

	}

	@PostMapping
	public void postProduto(@RequestBody Produto_Transiente novoProduto) {
		produtos.add(novoProduto);
	}

	@GetMapping
	public List<Produto_Transiente> getProdutos() {
		return this.produtos;
	}

	@GetMapping("/{id}")
	public Produto_Transiente getProdutoId(@PathVariable("id") String id) {
		for (Produto_Transiente p : produtos) {
			if (p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}

	@DeleteMapping("/{id}")
	public void deleteProdutoId(@PathVariable("id") String id) {
		Produto_Transiente paraRemover = null;
		for (Produto_Transiente p : produtos) {
			if (p.getId().equals(id)) {
				paraRemover = p;
			}
		}

		if (paraRemover != null) {
			produtos.remove(paraRemover);
		}
	}

}
