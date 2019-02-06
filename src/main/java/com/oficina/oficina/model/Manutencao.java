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
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "tab_manutencao")
public class Manutencao implements Serializable {

	private static final long serialVersionUID = -8725063621176961129L;
	
	@Id
	@SequenceGenerator(name = "seq_manutencao", sequenceName = "seq_manutencao")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_manutencao")
	@Column(name="cod_manutencao")
	private Long id;
	
	@Column(nullable = false, length = 50, name="qtd_horas_trabalhadas")
	private float qtdHorasTrabalhadas;
	
	@ManyToMany
	@JoinTable(name="tab_manutencao_peca",
		    joinColumns={@JoinColumn(name="cod_manutencao", referencedColumnName="cod_manutencao")},
		    inverseJoinColumns={@JoinColumn(name="cod_peca", referencedColumnName="cod_peca")})
	private List<Peca> listaPeca;
	
	@OneToOne
	@JoinColumn(name="cod_matricula", referencedColumnName="cod_matricula")
	private Mecanico mecanico;
	
	@OneToOne
	@JoinColumn(name="cod_equipamento", referencedColumnName="cod_equipamento")
	private Equipamento equipamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getQtdHorasTrabalhadas() {
		return qtdHorasTrabalhadas;
	}

	public void setQtdHorasTrabalhadas(float qtdHorasTrabalhadas) {
		this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
	}

	public List<Peca> getListaPeca() {
		return listaPeca;
	}

	public void setListaPeca(List<Peca> listaPeca) {
		this.listaPeca = listaPeca;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}


	
	

}
