package com.frc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.PrePersist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Movimiento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date fecha;
	private String tipoMovimiento;
	private Double valor;
	private Double saldo;
	@JsonBackReference
	@ManyToOne
    @JoinColumn(name = "FK_CUENTA", nullable = false)
	private Cuenta cuenta;
	
	@PrePersist
	void fecha() {
		fecha = new Date();
	}
}
	
