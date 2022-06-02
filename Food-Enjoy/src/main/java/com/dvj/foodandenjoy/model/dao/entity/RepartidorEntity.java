package com.dvj.foodandenjoy.model.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="T_REPARTIDOR")
public class RepartidorEntity {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Id
	private String nombre;
	
	private String apellido;
	
	private String direccion;
	
	private String email;
	
	private Long telefono;
	
	private String dni;
	
	private String localidad;
	
	private String nombreUsuario;
	
	private String contraseña;
	
	private String vehiculo;
	
	@Transient
	private String TokenJWT;

}
