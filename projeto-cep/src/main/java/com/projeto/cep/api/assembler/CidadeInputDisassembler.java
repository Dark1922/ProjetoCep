package com.projeto.cep.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projeto.cep.api.model.FreteInput;
import com.projeto.cep.domain.model.Frete;

@Component
public class CidadeInputDisassembler {
	@Autowired
	private ModelMapper modelMapper;

	public Frete toDomainObject(FreteInput freteInput) {
		return modelMapper.map(freteInput, Frete.class);
	}

	public void copyToDomainObject(FreteInput freteInput, Frete frete) {
		modelMapper.map(freteInput, frete);

	}
}