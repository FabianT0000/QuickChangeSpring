package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "perfiles")
public class Perfil {
	@Id
	@Column(name = "id_perfil")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String descripcion;

	public Perfil() {

	}

	public Perfil(Integer id, String descripcion) {

		this.id = id;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
