package com.frc.model;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
@MappedSuperclass
public class Persona {
	@NotEmpty(message="El nombre es obligatorio")
	private String nombre;
	@NotEmpty(message="El genero es obligatorio")
	private String genero;
	@NotNull(message="La edad es obligatoria")
	private Integer edad;
	@NotEmpty(message="La identificacion es obligatoria")
	private String identificacion;
	@NotEmpty(message="La direccion es obligatoria")
	private String direccion;
	@NotEmpty(message="El telefono es obligatorio")
	private String telefono;
	
	public Persona() {
		
	}
	public Persona(String nombre, String genero, Integer edad, String identificacion, String direccion, String telefono) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}

