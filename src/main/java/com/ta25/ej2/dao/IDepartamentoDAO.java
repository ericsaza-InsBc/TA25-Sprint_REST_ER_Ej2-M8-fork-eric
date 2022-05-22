package com.ta25.ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ta25.ej2.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Long> {

}
