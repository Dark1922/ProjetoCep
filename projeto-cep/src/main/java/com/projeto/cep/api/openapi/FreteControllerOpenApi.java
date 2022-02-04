package com.projeto.cep.api.openapi;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.projeto.cep.api.dto.FreteDTO;
import com.projeto.cep.api.exceptionhandler.Problem;
import com.projeto.cep.domain.model.Cep;
import com.projeto.cep.domain.model.Frete;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Fretes")
public interface FreteControllerOpenApi {

	@ApiOperation(value = "Lista de Fretes")
	ResponseEntity<List<Frete>> findAll();

	@ApiOperation("Busca um Frete por ID")
	@ApiResponses({ @ApiResponse(code = 400, message = "ID do frete inválido", response = Problem.class), })
	 ResponseEntity<FreteDTO> BuscarPorId(
			@ApiParam(value = "ID de um Frete", required = true, example = "1") @PathVariable Long id);

	@ApiOperation("Cadastra um Frete")
	 ResponseEntity<FreteDTO> save(
			@ApiParam(name = "corpo", value = "Representação de um novo Frete", required = true)
			@RequestBody @Valid FreteDTO freteDTO);
	
	@ApiOperation("Consulta dados de um cep")
	@ApiParam(name = "corpo", value = "Representação de um novo Frete", required = true, example = "73005-102")
	ResponseEntity<Cep> getCep(@PathVariable String cepNumber);
	

}
