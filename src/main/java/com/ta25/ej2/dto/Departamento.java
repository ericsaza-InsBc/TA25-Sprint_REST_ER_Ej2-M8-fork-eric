package com.ta25.ej2.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ta25.ej2.dto.Departamento;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DEPARTAMENTOS") // en caso que la tabla sea diferente

public class Departamento {

	// Atributos de la entidad Departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long pkCodigo;

	@Column(name = "NOMBRE") // no hace falta si se llama igual
	private String nombre;

	@Column(name = "PRESUPUESTO") // no hace falta si se llama igual
	private int presupuesto;

	@OneToMany
	@JoinColumn(name = "PK_CODIGO")
	private List<Departamento> departamento;

	// Constructores
	public Departamento() {
		super();
	}

	public Departamento(Long pkCodigo, String nombre, int presupuesto, List<Departamento> departamento) {
		super();
		this.pkCodigo = pkCodigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.departamento = departamento;
	}

	// Getters & Setters
	public Long getPkCodigo() {
		return pkCodigo;
	}

	public void setPkCodigo(Long pkCodigo) {
		this.pkCodigo = pkCodigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Departamento> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(List<Departamento> departamento) {
		this.departamento = departamento;
	}

}