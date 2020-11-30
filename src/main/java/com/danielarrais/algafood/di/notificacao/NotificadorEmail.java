package com.danielarrais.algafood.di.notificacao;


import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;	
	
	public NotificadorEmail() {
	}

	
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}


	public boolean isCaixaAlta() {
		return caixaAlta;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
