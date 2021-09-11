package br.unicesumar.adsis4s2021.meu.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseController;

@RestController
@RequestMapping("/produtos-meu")
public class MeuProdutoController extends MeuBaseController<MeuProduto, MeuProdutoRepository> {
	
	@Autowired
	private MeuProdutoRepository repo;
	// time que mudar no MeuBaseController o private REPO repo, para public.
	// Verificar com professor se está correto.
	@GetMapping("/com-preço-maior-que")
	public List<MeuProduto> getPreçoMaiorQue(@RequestParam double preço) {
		return repo.recuperarPreçoMaiorQue(preço);
	}

}