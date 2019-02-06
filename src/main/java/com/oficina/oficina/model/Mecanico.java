package com.oficina.oficina.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "tab_mecanico")
public class Mecanico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2396197002156650439L;
	
	@Id
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_matricula")
	@Column(name="cod_matricula")
	private Long id;
	
	@Column(nullable = false, length = 50, name="nom_mecanico")
	private String nomeMecanico;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeMecanico() {
		return nomeMecanico;
	}

	public void setNomeMecanico(String nomeMecanico) {
		this.nomeMecanico = nomeMecanico;
	}
	
	
}
