package com.edu.sena.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name = "productos")
public class Producto {
	@Id
    @Column(name="id_producto")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre_producto")
    private String nom_producto;
    @Column(name = "descripcion_producto")
    private String descripcion;
    
    private Double precio;
    
    @Temporal(TemporalType.DATE)
	@Column(name = "create_at")
	private Date createAt;

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
    
    public Producto() {}
    
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom_producto() {
		return nom_producto;
	}

	public void setNom_producto(String nom_producto) {
		this.nom_producto = nom_producto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
    
    


}
