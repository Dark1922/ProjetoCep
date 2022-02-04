package com.projeto.cep.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Frete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	  @Column(columnDefinition = "TEXT")
	    private String nomeDestinatario;
	  
	    private Double peso;
	    
	    @NotBlank
	    private String cepOrigem;
	    
	    private String cepDestino;
	    
	    @CreationTimestamp
	    private LocalDateTime dataPrevistaEntrega;
	    
	    @UpdateTimestamp
	    private LocalDateTime dataConsulta;
	    
	    private Double vlTotalFrete;
	   
	
}
