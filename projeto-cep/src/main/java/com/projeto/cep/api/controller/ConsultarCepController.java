package com.projeto.cep.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.cep.domain.model.Entrega;
import com.projeto.cep.domain.repository.viaCepConsumer;

@RestController
@RequestMapping(path = "/cep")
public class ConsultarCepController {

	@Autowired
	private viaCepConsumer viaCepConsumer;

	@GetMapping(value = "/{cepNumber}")
	public ResponseEntity<Entrega> getCep(@PathVariable String cepNumber) {

		Entrega result = viaCepConsumer.getCep(cepNumber);
		return ResponseEntity.ok().body(result);
	}

}
