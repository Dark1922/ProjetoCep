package com.projeto.cep.domain.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projeto.cep.domain.model.Cep;

@Repository
@FeignClient(value = "viacep-consumer", url = "https://viacep.com.br/")
public interface viaCepConsumer {

	@GetMapping(value = "/ws/{cep}/json")
	Cep getCep(@PathVariable("cep") String cep);

}
