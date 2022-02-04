package com.projeto.cep.domain.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.cep.domain.model.Entrega;


@Service
public class cadastroEntregaService {

	@Transactional
	public Entrega emitir(Entrega entrega) {

		if(entrega.getCepOrigem() == entrega.getCepDestino()) {
		 // calcularPrecoTotal(entrega.getVlTotalFrete());
		}
			
		

	    return entrega;
	}

	public void calcularPrecoTotal(Entrega entrega) {
	    BigDecimal peso = entrega.getPeso();
	    Integer preco = entrega.getPreco();
	    entrega.setVlTotalFrete(peso.multiply(new BigDecimal(preco)));
  }
	
}
