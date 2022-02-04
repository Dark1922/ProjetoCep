package com.projeto.cep.domain.exception;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioException(String msg) {
		super(msg); 
	}

	public NegocioException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}