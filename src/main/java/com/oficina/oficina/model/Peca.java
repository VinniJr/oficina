package com.oficina.oficina.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "tab_peca")
public class Peca implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8778066821604197439L;
	
	@Id
	@SequenceGenerator(name = "seq_peca", sequenceName = "seq_peca")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_peca")
	@Column(name="cod_peca")
	private Long id;

	@OneToMany
	@JoinTable(name="tab_manutencao_peca",
		    joinColumns={@JoinColumn(name="cod_peca", referencedColumnName="cod_peca")},
		    inverseJoinColumns={@JoinColumn(name="cod_manutencao", referencedColumnName="cod_manutencao")})
	private List<Manutencao> listaManutencao;
	
	@OneToOne
	@JoinColumn(name="cod_equipamento", referencedColumnName="cod_equipamento")
	private Equipamento equipamento;
	
	@Column(nullable = false, length = 50, name="nom_peca")
	@NotBlank(message = "Peca é uma informação obrigatória.")
	private String nomPeca;

	public List<Manutencao> getListaManutencao() {
		return listaManutencao;
	}

	public void setListaManutencao(List<Manutencao> listaManutencao) {
		this.listaManutencao = listaManutencao;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public String getNomPeca() {
		return nomPeca;
	}

	public void setNomPeca(String nomPeca) {
		this.nomPeca = nomPeca;
	}
	
	

	

	
	
	
	
	
}
