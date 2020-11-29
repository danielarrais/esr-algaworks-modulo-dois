package com.danielarrais.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.danielarrais.algafood.di.modelo.Cliente;
import com.danielarrais.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody // Para dispensar existencia de um arquivo HTML
	public String hello() {
		Cliente joao = new Cliente("João Arrais", "joaoarrais@gmail.com", "99 981324234");
		
		ativacaoClienteService.ativar(joao);
		
		return "Hello5";
	}

}
