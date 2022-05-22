package com.ta25.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta25.ej2.dao.IDepartamentoDAO;
import com.ta25.ej2.dto.Departamento;

public interface IDepartamentoService {

	// Metodos del CRUD
	public List<Departamento> listarDepartamentos(); // Listar All

	public Departamento guardarDepartamento(Departamento departamento); // Guarda un Departamento. CREATE

	public Departamento DepartamentoXID(Long pkCodigo); // Leer datos de un Departamento. READ

	public Departamento actualizarDepartamento(Departamento Departamento); // Actualiza datos del Departamento. UPDATE

	public void eliminarDepartamento(Long id);// Elimina el Departamento. DELETE

}
