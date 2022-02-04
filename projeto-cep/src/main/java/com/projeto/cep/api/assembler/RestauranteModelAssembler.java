package com.projeto.cep.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projeto.cep.api.model.FreteDTO;
import com.projeto.cep.domain.model.Frete;

@Component
public class RestauranteModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public FreteDTO toModel(Frete frete) {
		return modelMapper.map(frete, FreteDTO.class);
	}

	public List<FreteDTO> toCollectionModel(List<Frete> fretes) {
		return fretes.stream().map(frete -> toModel(frete)).collect(Collectors.toList());
	}
}
