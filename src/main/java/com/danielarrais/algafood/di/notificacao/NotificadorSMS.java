package com.danielarrais.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;

@Component
@TipoDoNotificador(TipoNotificacao.SMS)
public class NotificadorSMS implements Notificador {
	
	private boolean caixaAlta;	
	
	public NotificadorSMS() {
	}

	
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}


	public boolean isCaixaAlta() {
		return caixaAlta;
	}


	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
