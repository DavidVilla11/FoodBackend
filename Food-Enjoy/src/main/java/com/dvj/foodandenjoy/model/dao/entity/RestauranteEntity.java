package com.dvj.foodandenjoy.model.dao.entity;

import java.util.LinkedList;
import java.util.List;

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
@Table(name="T_RESTAURANTE")
public class RestauranteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombreRestaurante;
	
	private String nombre;
	
	private String apellido;
	
	private String direccion;
	
	private String localidad;
	
	private String email;
	
	private int telefono;
	
	private String imagen;
	
	private String nombreUsuario;
	
	private String contraseña;
	
	@Transient
	private String TokenJWT;
	
	//private List<ComidaEntity> comida = new LinkedList<ComidaEntity>();	
	
}
