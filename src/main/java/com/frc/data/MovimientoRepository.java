package com.frc.data;

import org.springframework.data.repository.CrudRepository;

import com.frc.model.Movimiento;

public interface MovimientoRepository extends CrudRepository<Movimiento, Long> {

}
