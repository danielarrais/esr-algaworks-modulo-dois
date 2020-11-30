package com.danielarrais.algafood.di.notificacao;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;

import com.danielarrais.algafood.di.modelo.Cliente;

//@Component
@Profile("prod")
@TipoDoNotificador(TipoNotificacao.EMAIL)
public class NotificadorEmail implements Notificador, InitializingBean, DisposableBean {
	
	private boolean caixaAlta;	
	
	@Value("${notificador.email.host-servidor}")
	private String hostServidor;
	
	@Value("${notificador.email.porta-servidor}")
	private Integer portaServidor;
	
	public NotificadorEmail() {
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Porta: %s\n", getPortaServidor().toString());
		System.out.printf("Servidor: %s\n", getHostServidor());
		
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

	public String getHostServidor() {
		return hostServidor;
	}

	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}

	public Integer getPortaServidor() {
		return portaServidor;
	}

	public void setPortaServidor(Integer portaServidor) {
		this.portaServidor = portaServidor;
	}
}
