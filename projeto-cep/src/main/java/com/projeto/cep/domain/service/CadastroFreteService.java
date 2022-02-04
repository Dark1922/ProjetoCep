package com.projeto.cep.domain.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.cep.api.dto.FreteDTO;
import com.projeto.cep.calcularfrete.TestCalcuatore;
import com.projeto.cep.domain.exception.CepNaoEncontradoException;
import com.projeto.cep.domain.model.Frete;
import com.projeto.cep.domain.repository.FreteRepository;
import com.projeto.cep.domain.viacep.EnderecoDTO;
import com.projeto.cep.domain.viacep.ViaCepWebService;

@Service
public class CadastroFreteService {

	@Autowired
	private FreteRepository freterepository;

	@Autowired
	private ViaCepWebService webService;

	@Transactional
	public FreteDTO save(FreteDTO dto) {
		Frete entity = new Frete();
		entity = copyDtoToEntity(entity, dto);
		freterepository.save(entity);
		return new FreteDTO(entity);
	}


	private Frete copyDtoToEntity(Frete entity, FreteDTO dto) {

		entity.setPeso(dto.getPeso());
		entity.setNomeDestinatario(dto.getNomeDestinatario());

		entity.setCepOrigem(dto.getCepOrigem());

		EnderecoDTO viaCepOrigem = webService.viaCepWebService(entity.getCepOrigem());
		String dddOrigem = viaCepOrigem.getDdd();
		String ufOrigem = viaCepOrigem.getUf();

		entity.setCepDestino(dto.getCepDestino());

		EnderecoDTO viaCepDestino = webService.viaCepWebService(entity.getCepDestino());
		String dddDestino = viaCepDestino.getDdd();
		String ufDestino = viaCepDestino.getUf();

		if (dddOrigem.equals(dddDestino) && ufOrigem.equals(ufDestino)) {
			entity.setDataPrevistaEntrega(LocalDateTime.now().plusDays(1L));
			TestCalcuatore.CalcularDddIgual(entity);
		}

		if (ufOrigem.equals(ufDestino) && !dddOrigem.equals(dddDestino)) {
			entity.setDataPrevistaEntrega(LocalDateTime.now().plusDays(3L));
			TestCalcuatore.CalcularUfIgual(entity);
		}

		if (!ufOrigem.equals(ufDestino)) {
			entity.setDataPrevistaEntrega(LocalDateTime.now().plusDays(10L));
			TestCalcuatore.CalcularFreteSemDesconto(entity);
		}

		return entity;
	}

	public Frete buscarOuFalhar(Long freteId) {
		return freterepository.findById(freteId).orElseThrow(() -> new CepNaoEncontradoException(freteId));
	}

}
