package com.oficina.oficina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.oficina.model.Equipamento;
import com.oficina.oficina.repository.EquipamentoRepository;

@Service
public class EquipamentoService {
	
	@Autowired 
	private EquipamentoRepository repository;
	
	public List<Equipamento> findAll() {
		return repository.findAll();
	}
	
	public Equipamento findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Equipamento save(Equipamento equipamento) {
		return repository.saveAndFlush(equipamento);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}

}
