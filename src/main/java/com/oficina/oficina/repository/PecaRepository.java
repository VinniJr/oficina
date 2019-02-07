package com.oficina.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oficina.oficina.model.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long> {

}
