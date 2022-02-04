package com.projeto.cep.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.cep.domain.model.Frete;

@Repository
public interface FreteRepository extends JpaRepository<Frete, Long> {

	@Query("SELECT obj FROM Frete obj WHERE obj.cepOrigem = :cepOrigem AND " + "obj.cepDestino = :cepDestino AND "
			+ "obj.nomeDestinatario = :nomeDestinatario ")
	List<Frete> findByFrete(String cepOrigem, String cepDestino, String nomeDestinatario);
}
