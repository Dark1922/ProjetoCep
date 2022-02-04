package com.projeto.cep.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.cep.domain.model.Frete;

@Repository
public interface FreteRepository extends JpaRepository<Frete, Long> {
	
}
