package br.unicesumar.adsis4s2021.meu.cidade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseController;

@RestController
@RequestMapping("/cidades-meu")
public class MeuCidadeController extends MeuBaseController<MeuCidade, MeuCidadeRepository>{

}
