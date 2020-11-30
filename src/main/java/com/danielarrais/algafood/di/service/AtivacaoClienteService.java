package com.danielarrais.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;
import com.danielarrais.algafood.di.notificacao.Notificador;
import com.danielarrais.algafood.di.notificacao.TipoDoNotificador;
import com.danielarrais.algafood.di.notificacao.TipoNotificacao;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	@TipoDoNotificador(TipoNotificacao.SMS)
	private Notificador notificador;

	public AtivacaoClienteService() {
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema agora está ativo!");
	}
}
