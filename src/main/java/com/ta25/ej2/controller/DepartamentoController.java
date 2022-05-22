package com.ta25.ej2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta25.ej2.dto.Departamento;
import com.ta25.ej2.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;

	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos() {
		return departamentoServiceImpl.listarDepartamentos();
	}

	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {

		return departamentoServiceImpl.guardarDepartamento(departamento);
	}

	@GetMapping("/departamentos/{PK_CODIGO}")
	public Departamento departamentoXID(@PathVariable(name = "PK_CODIGO") Long PK_CODIGO) {

		Departamento departamento_xid = new Departamento();

		departamento_xid = departamentoServiceImpl.DepartamentoXID(PK_CODIGO);

		System.out.println("Departemento XID: " + departamento_xid);

		return departamento_xid;
	}

	@PutMapping("/departamentos/{PK_CODIGO}")
	public Departamento actualizarDepartemento(@PathVariable(name = "PK_CODIGO") Long PK_CODIGO,
			@RequestBody Departamento departamento) {

		Departamento departamento_seleccionado = new Departamento();
		Departamento departamento_actualizado = new Departamento();

		departamento_seleccionado = departamentoServiceImpl.DepartamentoXID(PK_CODIGO);
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());

		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);

		System.out.println("El departamento actualizado es: " + departamento_actualizado);

		return departamento_actualizado;
	}

	@DeleteMapping("/departamentos/{PK_CODIGO}")
	public void eleiminarDepartemento(@PathVariable(name = "PK_CODIGO") Long PK_CODIGO) {
		departamentoServiceImpl.eliminarDepartamento(PK_CODIGO);
	}

}