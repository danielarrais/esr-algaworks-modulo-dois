package com.danielarrais.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;
import com.danielarrais.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired(required = false)
	private Notificador notificador;
	
	public AtivacaoClienteService() {
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador == null) {
			System.out.println("Não há um notificador disponível!");
		} else {

			notificador.notificar(cliente, "Seu cadastro no sistema agora está ativo!");
		}
	}
}
