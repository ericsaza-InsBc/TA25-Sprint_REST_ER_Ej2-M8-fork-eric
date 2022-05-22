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

import com.ta25.ej2.dto.Empleado;
import com.ta25.ej2.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado salvarCliente(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{codigoDNI}")
	public Empleado EmpleadoXID(@PathVariable(name="PK_DNI") Long codigoDNI) {
		
		Empleado empleado_xid= new Empleado();
		
		empleado_xid = empleadoServiceImpl.EmpleadoXID(codigoDNI);
		
		System.out.println("Empleado XID: " + empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{codigDNI}")
	public Empleado actualizarCliente(@PathVariable(name="PK_DNI")Long codigoDNI,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.EmpleadoXID(codigoDNI);
		
		empleado_seleccionado.setCodigoDNI(empleado.getCodigoDNI());
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El departamento actualizado es: " + empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/codigoDNI}")
	public void eleiminarCliente(@PathVariable(name="PK_DNI")Long codigoDNI) {
		empleadoServiceImpl.eliminarEmpleado(codigoDNI);
	}
	
}
