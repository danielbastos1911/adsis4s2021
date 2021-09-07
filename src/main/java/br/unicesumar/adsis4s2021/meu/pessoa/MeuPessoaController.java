package br.unicesumar.adsis4s2021.meu.pessoa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseController;

@RestController
@RequestMapping("/pessoas-meu")
public class MeuPessoaController extends MeuBaseController<MeuPessoa, MeuPessoaRepository>{

}
