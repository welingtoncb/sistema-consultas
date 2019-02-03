package com.consultas.serv.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@ToString
@EqualsAndHashCode
public class Cobertura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="id_plano", referencedColumnName="id")	
	private Plano plano;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="id_procedimento", referencedColumnName="id")
	private Procedimento procedimento;

	public Long getId() {
		return id;
	}

	public Plano getPlano() {
		return plano;
	}

	public Procedimento getProcedimento() {
		return procedimento;
	}
	
}
