package com.oficina.oficina.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "tab_equipamento")
public class Equipamento implements Serializable {

	private static final long serialVersionUID = 4167620772689910210L;
	
	@Id
	@SequenceGenerator(name = "seq_equipamento", sequenceName = "seq_equipamento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_equipamento")
	@Column(name="cod_equipamento")
	private Long id;
	
	@Column(nullable = false, length = 50, name="des_equipamento")
	private String desEquipamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesEquipamento() {
		return desEquipamento;
	}

	public void setDesEquipamento(String desEquipamento) {
		this.desEquipamento = desEquipamento;
	}
	
	
}
