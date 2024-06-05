package com.frc.data;

import org.springframework.data.repository.CrudRepository;

import com.frc.model.Cuenta;

public interface CuentaRepository extends CrudRepository<Cuenta, Long> {

}
