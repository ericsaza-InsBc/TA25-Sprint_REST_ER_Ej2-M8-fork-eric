package com.ta25.ej2.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ta25.ej2.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

}
