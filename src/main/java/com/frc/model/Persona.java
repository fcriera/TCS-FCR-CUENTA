package com.frc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="El nombre es obligatorio")
	private String nombre;
	@NotEmpty(message="El genero es obligatorio")
	private String genero;
	@NotEmpty(message="La edad es obligatoria")
	private String edad;
	@Digits(integer=10, fraction=0, message="ID invalida")
	private int identificacion;
	@NotEmpty(message="La direccion es obligatoria")
	private String direccion;
	@Digits(integer=9, fraction=0, message="Numero telefonico invalido")
	private int telefono;
}

