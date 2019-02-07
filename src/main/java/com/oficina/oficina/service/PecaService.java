package com.oficina.oficina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.model.Peca;
import com.oficina.oficina.repository.PecaRepository;

@Service
public class PecaService {
	
	@Autowired 
	private PecaRepository repository;
	
	public List<Peca> findAll() {
		return repository.findAll();
	}
	
	public Peca findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Peca save(Peca peca) {
		return repository.saveAndFlush(peca);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}

}
