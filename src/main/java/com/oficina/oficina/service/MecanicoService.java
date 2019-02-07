package com.oficina.oficina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.model.Mecanico;
import com.oficina.oficina.repository.MecanicoRepository;

@Service
public class MecanicoService {
	
	@Autowired 
	private MecanicoRepository repository;
	
	public List<Mecanico> findAll() {
		return repository.findAll();
	}
	
	public Mecanico findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Mecanico save(Mecanico mecanico) {
		return repository.saveAndFlush(mecanico);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}

}
