package com.projeto.cep.api.dto;

import javax.validation.constraints.NotBlank;

import com.projeto.cep.domain.model.Frete;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FreteInput {
	@NotBlank
	private String cepOrigem;
	
	@NotBlank
	private String cepDestino;
	
	@NotBlank
	private Double peso;
	
	@NotBlank
	private String nomeDestinatario;

	public void FreteRequestDTO(Frete entity) {
		cepOrigem = entity.getCepOrigem();
		cepDestino = entity.getCepDestino();
		peso = entity.getPeso();
		nomeDestinatario = entity.getNomeDestinatario();

	}
}
