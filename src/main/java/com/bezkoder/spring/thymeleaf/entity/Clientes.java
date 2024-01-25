package com.bezkoder.spring.thymeleaf.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "clientes")

public class Clientes {
	
	@Id
	private int id;
	private String nombre;
	private float facturacion;
	
	public Clientes() {
		super();
	}

	public Clientes(int id, String nombre, float facturacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.facturacion = facturacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public float getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(float facturacion) {
		this.facturacion = facturacion;
	}
	
	
	
}
