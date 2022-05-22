package com.ta25.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta25.ej2.dao.IDepartamentoDAO;
import com.ta25.ej2.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	//Utilizamos los metodos de la interface IDepartamentoDAO, es como si instaciaramos.
		@Autowired
		IDepartamentoDAO iDepartamentoDAO;
		
		@Override
		public List<Departamento> listarDepartamentos() {
			
			return iDepartamentoDAO.findAll();
		}

		@Override
		public Departamento guardarDepartamento(Departamento Departamento) {
			
			return iDepartamentoDAO.save(Departamento);
		}

		@Override
		public Departamento DepartamentoXID(Long id) {
			
			return iDepartamentoDAO.findById(id).get();
		}

		@Override
		public Departamento actualizarDepartamento(Departamento Departamento) {
			
			return iDepartamentoDAO.save(Departamento);
		}

		@Override
		public void eliminarDepartamento(Long pkCodigo) {
			
			iDepartamentoDAO.deleteById(pkCodigo);
			
		}

	}
