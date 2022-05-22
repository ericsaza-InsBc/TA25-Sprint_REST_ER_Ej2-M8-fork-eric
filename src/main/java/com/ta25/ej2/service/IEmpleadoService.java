package com.ta25.ej2.service;

import java.util.List;

import com.ta25.ej2.dto.Empleado;

public interface IEmpleadoService {

	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar All

	public Empleado guardarEmpleado(Empleado Empleado); // Guarda un Empleado. CREATE

	public Empleado EmpleadoXID(Long pkCodigo); // Leer datos de un Empleado. READ

	public Empleado actualizarEmpleado(Empleado Empleado); // Actualiza datos del Empleado. UPDATE

	public void eliminarEmpleado(Long codigoDNI);// Elimina el Empleado. DELETE
	
}
