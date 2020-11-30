package com.danielarrais.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.danielarrais.algafood.di.notificacao.NotificadorEmail;

@Configuration
public class AlgaConfig {
	
	@Bean
	@Profile("prod")
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail();
		notificadorEmail.setCaixaAlta(true);
		
		return notificadorEmail;
	}
}
