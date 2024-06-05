package com.frc.data;

import org.springframework.data.repository.CrudRepository;

import com.frc.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
