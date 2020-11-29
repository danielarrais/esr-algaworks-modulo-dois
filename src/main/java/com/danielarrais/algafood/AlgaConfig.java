package com.danielarrais.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.danielarrais.algafood.di.notificacao.Notificador;
import com.danielarrais.algafood.di.notificacao.NotificadorEmail;
import com.danielarrais.algafood.di.service.AtivacaoClienteService;

@Configuration
public class AlgaConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algamail.com.br");
		notificadorEmail.setCaixaAlta(true);
		
		return notificadorEmail;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
