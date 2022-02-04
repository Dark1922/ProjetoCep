package com.projeto.cep.domain.exception;

import com.projeto.cep.domain.model.Cep;

public class CepNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CepNaoEncontradoException(Cep cep) {
		this(String.format("Não existe um cadastro de cep com o números, escreva um cep válido %s", cep.getCep()));;
	}

	public CepNaoEncontradoException(String message) {
		super(message);
	}
	

}
