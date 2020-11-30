package com.danielarrais.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;

@Component
@Profile("dev")
@TipoDoNotificador(TipoNotificacao.EMAIL)
public class NotificadorEmailMock implements Notificador {
	
	private boolean caixaAlta;	
	
	public NotificadorEmailMock() {
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("A notificação seria enviada para %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

	public boolean isCaixaAlta() {
		return caixaAlta;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
