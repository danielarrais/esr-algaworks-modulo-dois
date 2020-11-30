package com.danielarrais.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.notificacao.Notificador;
import com.danielarrais.algafood.di.notificacao.TipoDoNotificador;
import com.danielarrais.algafood.di.notificacao.TipoNotificacao;
import com.danielarrais.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoListenerEvents {
	
	@Autowired
	@TipoDoNotificador(TipoNotificacao.EMAIL)
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent ativadoEvent) {
		notificador.notificar(ativadoEvent.getCliente(), "Seu cadastro no sistema agora está ativo!");
	}

}
