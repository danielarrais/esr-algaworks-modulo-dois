package com.danielarrais.algafood.di.service;

import com.danielarrais.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	private Cliente cliente;
	
	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
