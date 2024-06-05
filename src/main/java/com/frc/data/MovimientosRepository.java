package com.frc.data;

import org.springframework.data.repository.CrudRepository;

import com.frc.model.Movimientos;

public interface MovimientosRepository extends CrudRepository<Movimientos, Long> {

}
