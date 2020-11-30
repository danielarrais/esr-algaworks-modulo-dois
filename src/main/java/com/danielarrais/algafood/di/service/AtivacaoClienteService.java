package com.danielarrais.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public AtivacaoClienteService() {
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
}
