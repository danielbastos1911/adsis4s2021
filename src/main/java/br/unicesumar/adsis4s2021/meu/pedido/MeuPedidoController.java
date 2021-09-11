package br.unicesumar.adsis4s2021.meu.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.base.MeuBaseController;

@RestController
@RequestMapping("/pedidos-meu")
public class MeuPedidoController extends MeuBaseController<MeuPedido, MeuPedidoRepository>{

}
