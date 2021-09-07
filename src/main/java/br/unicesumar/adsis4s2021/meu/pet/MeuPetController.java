package br.unicesumar.adsis4s2021.meu.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets-meu")
public class MeuPetController {
	// Conexão com o banco
	@Autowired
	private MeuPetRepository repo;

	@DeleteMapping("/{id}")
	public void deletePeloId(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

	@GetMapping
	public List<MeuPet> get() {
		return repo.findAll();
	}

	@PostMapping
	public String post(@RequestBody MeuPet novo) {

		if (repo.findById(novo.getId()).isPresent()) {
			throw new RuntimeException("Seu produto já existe, faça um PUT em vez de POST!");
		}
		novo = repo.save(novo);
		return novo.getId();
	}

	@GetMapping("/{id}")
	public MeuPet getPetPeloId(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}

	@PutMapping("/{id}")
	public String put(@RequestBody MeuPet modificado, @PathVariable("id") String id) {

		if (!modificado.getId().equals(id)) {
			throw new RuntimeException("Para atualizar um pet, os IDs do request devem ser iguais!!");
		}

		if (!repo.findById(id).isPresent()) {
			throw new RuntimeException("Seu pet não existe, faça um POST em vez de PUT!");
		}
		modificado = repo.save(modificado);
		return modificado.getId();
	}

}
