package com.projeto.cep.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Entrega {

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
	
    private BigDecimal vlTotalFrete;
    
    private BigDecimal desconto;
	
	private OffsetDateTime dataPrevistaEntrega;
	
	private String cepOrigem;
	
	private String cepDestino;
	
	private OffsetDateTime dataConsulta;
	
	private String nomeDestinatário;
	
	private BigDecimal peso;
	
	private Integer preco = 1;
	
}
