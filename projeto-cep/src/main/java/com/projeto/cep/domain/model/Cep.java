package com.projeto.cep.domain.model;

import lombok.Data;

@Data
public class Cep {
	
	
	
	/*dados de consulta cep*/
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	
}
