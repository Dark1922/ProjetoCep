package com.projeto.cep.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.cep.api.dto.FreteDTO;
import com.projeto.cep.domain.model.Cep;
import com.projeto.cep.domain.model.Frete;
import com.projeto.cep.domain.repository.FreteRepository;
import com.projeto.cep.domain.repository.viaCepConsumer;
import com.projeto.cep.domain.service.CadastroFreteService;

@RestController
@RequestMapping(path = "/frete", produces = MediaType.APPLICATION_JSON_VALUE)
public class FreteCepController {

	@Autowired
	private viaCepConsumer viaCepConsumer;

	@Autowired
	private CadastroFreteService cadastroFreteService;
	
	@Autowired
	private FreteRepository freteRepository;
	

	/* Consulta dados de um cep completo */
	@GetMapping(value = "/consultar-cep/{cepNumber}")
	public ResponseEntity<Cep> getCep(@PathVariable String cepNumber) {
		Cep result = viaCepConsumer.getCep(cepNumber);
		return ResponseEntity.ok().body(result);
	}
	
	/*Buscar Todos*/
	@GetMapping
	public ResponseEntity<List<Frete>> findAll() {
		return ResponseEntity.ok(freteRepository.findAll());
	}
	
	/*Buscar Por Id*/
	@GetMapping("/{id}")
	public ResponseEntity<FreteDTO> BuscarPorId(@PathVariable Long id) {
        Frete frete = cadastroFreteService.buscarOuFalhar(id);
        	return new ResponseEntity<FreteDTO>(new FreteDTO(frete), HttpStatus.OK);
	}

	/*Cadastro de Frete com regra de negócio */
	@PostMapping
	public ResponseEntity<FreteDTO> save(@RequestBody @Valid FreteDTO freteDTO) {
		return ResponseEntity.status(HttpStatus.CREATED).body(cadastroFreteService.save(freteDTO));
	}

	@GetMapping(value = "/cepOrigem/{cepOrigem}/cepDestino/{cepDestino}/nomeDestinatario/{nomeDestinatario}")
	public ResponseEntity<List<Frete>> findFrete(@PathVariable String cepOrigem, @PathVariable String cepDestino,
			@PathVariable String nomeDestinatario) {
		return ResponseEntity.ok().body(cadastroFreteService.findFrete(cepOrigem, cepDestino, nomeDestinatario));
	}

}
