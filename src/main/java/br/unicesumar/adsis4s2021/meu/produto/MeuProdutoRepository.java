package br.unicesumar.adsis4s2021.meu.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MeuProdutoRepository extends JpaRepository<MeuProduto, String>{
	
	@Query("select p from MeuProduto p where p.preco >= :preco")
	List<MeuProduto> recuperarPreçoMaiorQue (double preco);
	
	
	
	
}
