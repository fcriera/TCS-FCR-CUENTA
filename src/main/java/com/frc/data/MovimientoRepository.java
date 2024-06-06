package com.frc.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frc.model.Cuenta;
import com.frc.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
	Movimiento findFirstByCuentaOrderByFechaDesc(Cuenta cuenta);

	Movimiento findFirstByCuentaOrderByFechaDesc(Optional<Cuenta> cuenta);
}

