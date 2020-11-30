package com.danielarrais.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.danielarrais.algafood.di.notificacao.NotificadorEmail;

@Configuration
public class AlgaConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail();
		notificadorEmail.setCaixaAlta(true);
		
		return notificadorEmail;
	}
}
