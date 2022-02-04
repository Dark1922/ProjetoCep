package com.projeto.cep.api.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.cep.domain.model.Frete;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FreteDTO {

    private Long id;
    private String cepOrigem;
    
    private String cepDestino;
    
    private Double peso;
    
    private String nomeDestinatario;
    
    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataPrevistaEntrega;
    
    private Double vlTotalFrete;

    public FreteDTO(Frete entity) {
        id = entity.getId();
        cepOrigem = entity.getCepOrigem();
        cepDestino = entity.getCepDestino();
        vlTotalFrete = entity.getVlTotalFrete();
        dataPrevistaEntrega = entity.getDataPrevistaEntrega();
        peso = entity.getPeso();
        nomeDestinatario = entity.getNomeDestinatario();
    }

}
