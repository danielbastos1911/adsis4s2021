package br.unicesumar.adsis4s2021.meu.categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseController;

@RestController
@RequestMapping("/categorias-meu")
public class MeuCategoriaController extends MeuBaseController<MeuCategoria, MeuCategoriaRepository>{

}
