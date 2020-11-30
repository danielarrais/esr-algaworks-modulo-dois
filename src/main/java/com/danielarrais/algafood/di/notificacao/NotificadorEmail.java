package com.danielarrais.algafood.di.notificacao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;

import com.danielarrais.algafood.di.modelo.Cliente;

//@Component
@TipoDoNotificador(TipoNotificacao.EMAIL)
public class NotificadorEmail implements Notificador, InitializingBean, DisposableBean {

	private boolean caixaAlta;

	@Autowired
	private NotificadorEmailProperties emailProperties;

	public NotificadorEmail() {
	}

	public void notificar(Cliente cliente, String mensagem) {
		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}

		System.out.printf("Porta: %s\n", getEmailProperties().getPortaServidor().toString());
		System.out.printf("Servidor: %s\n", getEmailProperties().getHostServidor());

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

	public NotificadorEmailProperties getEmailProperties() {
		return emailProperties;
	}

	public void setEmailProperties(NotificadorEmailProperties emailProperties) {
		this.emailProperties = emailProperties;
	}
}
