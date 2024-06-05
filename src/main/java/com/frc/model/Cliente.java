package com.frc.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cliente extends Persona{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String clienteId;
	private String contrasena;
	private boolean estado;
	
	public Cliente(String nombre, String genero, int edad, int identificacion, String direccion, int telefono, Long id, String clienteId, String contrasena, boolean estado) {
		super();
		this.id = id;
		this.clienteId = clienteId;
		this.contrasena = contrasena;
		this.estado = estado;
	}

}
