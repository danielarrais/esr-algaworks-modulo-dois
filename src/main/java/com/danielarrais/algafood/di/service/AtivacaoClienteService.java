package com.danielarrais.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;
import com.danielarrais.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired(required = false)
	private List<Notificador> notificadores;
	
	public AtivacaoClienteService() {
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificadores.stream().forEach(notificador -> {
			notificador.notificar(cliente, "Seu cadastro no sistema agora está ativo!");
		});
	}
}
