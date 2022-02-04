package com.projeto.cep.api.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.cep.domain.model.Frete;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FreteDTO {

	private Long id;
	
	private String cepOrigem;

	private String cepDestino;

	private Double peso;

	private String nomeDestinatario;

	@CreationTimestamp
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dataPrevistaEntrega;

	private Double vlTotalFrete;

	public FreteDTO(Frete frete) {
		id = frete.getId();
		cepOrigem = frete.getCepOrigem();
		cepDestino = frete.getCepDestino();
		vlTotalFrete = frete.getVlTotalFrete();
		nomeDestinatario = frete.getNomeDestinatario();
		peso = frete.getPeso();
		dataPrevistaEntrega = frete.getDataPrevistaEntrega();
	}

}
