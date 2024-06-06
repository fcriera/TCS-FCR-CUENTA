package com.frc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	private int edad;
	@NotEmpty(message="La identificacion es obligatoria")
	private String identificacion;
	@NotEmpty(message="La direccion es obligatoria")
	private String direccion;
	@NotEmpty(message="El telefono es obligatorio")
	private String telefono;
	
	public Persona(String nombre, String genero, int edad, String identificacion, String direccion, String telefono) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}

