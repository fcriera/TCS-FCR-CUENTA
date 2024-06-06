package com.frc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente extends Persona{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="La contrasena es obligatoria")
	private String contrasena;
	private boolean estado;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre,String genero, int edad, String identificacion, String direccion, String telefono, String contrasena, boolean estado) {
		super(nombre, genero, edad, identificacion, direccion, telefono);
		this.contrasena = contrasena;
		this.estado = estado;
	}
	

}
