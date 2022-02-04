package com.projeto.cep.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Frete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@ApiModelProperty(example = "1", position = 0)
	private Long id;

	@ApiModelProperty(example = "Lucas Almeida Almirante", position = 7, required = true)
	private String nomeDestinatario;

	@ApiModelProperty(example = "38.92", position = 6, required = true)
	private Double peso;

	@ApiModelProperty(example = "15230-000", position = 1, required = true)
	private String cepOrigem;

	@ApiModelProperty(example = "17800-000", position = 4, required = true)
	private String cepDestino;

	@ApiModelProperty(example = "2022-02-04 14:18:23", position = 9)
	private LocalDateTime dataPrevistaEntrega;

	@ApiModelProperty(example = "2022-02-04 14:18:23", position = 10)
	@CreationTimestamp
	private LocalDateTime dataConsulta;

	@ApiModelProperty(example = "30.0", position = 11)
	private Double vlTotalFrete;

}
