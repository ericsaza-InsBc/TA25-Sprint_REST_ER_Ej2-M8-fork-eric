package com.ta25.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta25.ej2.dao.IEmpleadoDAO;
import com.ta25.ej2.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	// Utilizamos los metodos de la interface IEmpleadoDAO, es como si
	// instanciaramos.
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {

		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {

		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado EmpleadoXID(Long codigoDNI) {

		return iEmpleadoDAO.findById(codigoDNI).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {

		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long codigoDNI) {

		iEmpleadoDAO.deleteById(codigoDNI);

	}
}
