package com.frc.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
@Table(name="cuenta")
public class Cuenta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="numero_cuenta")
	private String numeroCuenta;
	@Column(name="tipo_cuenta")
	private String tipoCuenta;
	@Column(name="saldo_inicial")
	private Double saldoInicial;
	private boolean estado;
}
