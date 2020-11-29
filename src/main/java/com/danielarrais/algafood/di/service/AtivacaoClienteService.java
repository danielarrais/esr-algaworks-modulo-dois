package com.danielarrais.algafood.di.service;

import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;
import com.danielarrais.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema agora está ativo!");
	}
}
