package com.danielarrais.algafood.di.notificacao;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;

import com.danielarrais.algafood.di.modelo.Cliente;

//@Component
@Profile("prod")
@TipoDoNotificador(TipoNotificacao.EMAIL)
public class NotificadorEmail implements Notificador, InitializingBean, DisposableBean {
	
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
	
//	@PostConstruct
	public void afterPropertiesSet() {
		System.out.println("Contruiu o notificador!");
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("Destru o notificador!");
	}
}
