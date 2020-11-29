package com.danielarrais.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;	
	private String hostServidorSMTP;
	
	public NotificadorEmail(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
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


	public String getHostServidorSMTP() {
		return hostServidorSMTP;
	}


	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}


	public void setHostServidorSMTP(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
	}
}
