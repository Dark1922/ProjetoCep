package com.projeto.cep.api.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.cep.domain.model.Frete;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FreteDTO {

	@ApiModelProperty(example = "1", position = 0)
	private Long id;

	@ApiModelProperty(example = "15230-000", position = 1, required = true)
	@NotBlank
	private String cepOrigem;

	@ApiModelProperty(example = "17800-000", position = 4, required = true)
	@NotBlank
	private String cepDestino;

	@ApiModelProperty(example = "38.92", position = 6, required = true)
	@NotNull
	private Double peso;

	@ApiModelProperty(example = "Lucas Almeida Almirante", position = 7, required = true)
	@NotBlank
	private String nomeDestinatario;

	@ApiModelProperty(example = "2022-02-04 14:18:23", position = 9)
	@CreationTimestamp
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dataPrevistaEntrega;

	@ApiModelProperty(example = "30.0", position = 11)
	private Double vlTotalFrete;

	@ApiModelProperty(example = "2022-02-04 14:18:23", position = 9)
	@CreationTimestamp
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dataConsulta;

	public FreteDTO(Frete frete) {
		id = frete.getId();
		cepOrigem = frete.getCepOrigem();
		cepDestino = frete.getCepDestino();
		vlTotalFrete = frete.getVlTotalFrete();
		nomeDestinatario = frete.getNomeDestinatario();
		peso = frete.getPeso();
		dataPrevistaEntrega = frete.getDataPrevistaEntrega();
		dataConsulta = frete.getDataConsulta();
	}

}
