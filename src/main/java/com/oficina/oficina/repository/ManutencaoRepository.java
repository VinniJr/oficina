package com.oficina.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oficina.oficina.model.Manutencao;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao, Long>{

}
