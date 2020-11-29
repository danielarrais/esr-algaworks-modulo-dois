package com.danielarrais.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.danielarrais.algafood.di.modelo.Cliente;

@Component
public interface Notificador {

	void notificar(Cliente cliente, String string);

}