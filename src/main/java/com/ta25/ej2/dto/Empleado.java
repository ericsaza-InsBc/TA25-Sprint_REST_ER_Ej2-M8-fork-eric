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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ta25.ej2.dto.Empleado;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "EMPLEADOS") // en caso que la tabla sea diferente

public class Empleado {

	// Atributos de la entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private String codigoDNI;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@ManyToOne
	@JoinColumn(name = "DEPARTAMENTO")
	private Departamento departamento;

	// Constructores

	public Empleado() {

	}

	public Empleado(String codigoDNI, String nombre, String apellidos, Departamento departamento) {
		super();
		this.codigoDNI = codigoDNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	// Getters & Setters

	public String getCodigoDNI() {
		return codigoDNI;
	}

	public void setCodigoDNI(String codigoDNI) {
		this.codigoDNI = codigoDNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	// to String
	@Override
	public String toString() {
		return "Empleado [codigoDNI=" + codigoDNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", departamento=" + departamento + "]";
	}

}
