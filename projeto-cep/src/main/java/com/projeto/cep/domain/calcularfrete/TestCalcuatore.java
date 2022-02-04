package com.projeto.cep.domain.calcularfrete;

import com.projeto.cep.domain.model.Frete;

public class TestCalcuatore {

	public static final Double VALOR_PARA_CADA_KG = 1000.00;
	public static final Double VALOR_PARA_ACHAR_EM_KG = 1000.0; // Peso seria em gramas para ser convertido em KG
	public static final Double DESCONTO_DDD_IGUAL = 0.5;
	public static final Double DESCONTO_UF_IGUAL = 0.75;

	static Double valorFrete = 0.0;
	static Double valorAux = 0.0;

	public static Double CalcularDddIgual(Frete entity) {

		valorAux = (entity.getPeso() / VALOR_PARA_ACHAR_EM_KG) * VALOR_PARA_CADA_KG;
		valorFrete = valorAux - (valorAux * DESCONTO_DDD_IGUAL);
		entity.setVlTotalFrete(valorFrete);
		return valorFrete;
	}

	public static Double CalcularUfIgual(Frete entity) {

		valorAux = (entity.getPeso() / VALOR_PARA_ACHAR_EM_KG) * VALOR_PARA_CADA_KG;
		valorFrete = valorAux - (valorAux * DESCONTO_UF_IGUAL);
		entity.setVlTotalFrete(valorFrete);

		return valorFrete;
	}

	public static Double CalcularFreteSemDesconto(Frete entity) {
		valorFrete = (entity.getPeso() / VALOR_PARA_ACHAR_EM_KG) * VALOR_PARA_CADA_KG;
		entity.setVlTotalFrete(valorFrete);

		return valorFrete;
	}
}