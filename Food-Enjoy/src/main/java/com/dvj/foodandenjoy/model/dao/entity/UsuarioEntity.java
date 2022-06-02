package com.dvj.foodandenjoy.model.dao.entity;

import javax.persistence.Column;
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
@Table(name="T_USUARIO")
public class UsuarioEntity {
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Id
	@Column(name = "dni")
	private String DNI;

	private String nombre;
	
	private String apellido;
	
	private String direccion;
	
	private String localidad;
	
	private String email;
	
	private int telefono;
	
	private String nombreUsuario;
	
	private String contraseña;
	
	@Transient
	private String tokenJWT;

}
