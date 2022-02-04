package com.projeto.cep.domain.model;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Cep {

	/* dados de consulta cep */

	@NotBlank
	@ApiModelProperty(example = "15230-000", position = 5, name = "Digite um cep válido")
	private String cep;

	@ApiModelProperty(example = "Rua Bernati", position = 10)
	private String logradouro;

	@ApiModelProperty(example = "ap 204", position = 15)
	private String complemento;

	@ApiModelProperty(example = "são carlos", position = 20)
	private String bairro;

	@ApiModelProperty(example = "Adolfo", position = 25)
	private String localidade;

	@ApiModelProperty(example = "SP", position = 30)
	private String uf;

	@ApiModelProperty(example = "3500204", position = 35)
	private String ibge;

	@ApiModelProperty(example = "1510", position = 40)
	private String gia;

	@ApiModelProperty(example = "17", position = 45)
	private String ddd;

	@ApiModelProperty(example = "6103", position = 50)
	private String siafi;

}
