package com.projeto.cep.domain.exception;

public class CepNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public CepNaoEncontradoException(String msg) {
		super(msg); 
	}

	public CepNaoEncontradoException(Long freteId) {//constructor dando o this no construtor acima mandando uma msg padrão
		this(String.format("Não existe um cadastro de frete com o código %d", freteId));
	}
	

}
