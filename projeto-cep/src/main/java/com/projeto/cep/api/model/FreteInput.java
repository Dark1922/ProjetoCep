package com.projeto.cep.api.model;

import com.projeto.cep.domain.model.Frete;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FreteInput {

    private String cepOrigem;
    private String cepDestino;
    private Double peso;
    private String nomeDestinatario;

    public void FreteDTO(Frete entity) {
        cepOrigem = entity.getCepOrigem();
        cepDestino = entity.getCepDestino();
        peso = entity.getPeso();
        nomeDestinatario = entity.getNomeDestinatario();

    }
}
