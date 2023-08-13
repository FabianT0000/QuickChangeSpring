package com.edu.sena.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {

	@Id
    @Column(name="id_proveedor")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre_proveedor")
    private String nombres;
    @Column(name="tel_proveedor")
    private String telefono;
    @Column(name="ciudad_proveedor")
    private String ciudad;
    @Column(name="correo_proveedor")
    private String correo;
    
    @ManyToMany(fetch =(FetchType.EAGER) )
    @JoinTable(name="proveedorproducto",
	   joinColumns = @JoinColumn(name="id_proveedor"),
	   inverseJoinColumns = @JoinColumn(name="id_producto")			
	)
    private List<Producto> productos;
    
    
    
	public Proveedor() {
	
	}

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public List<Producto> getProductos() {
		return productos;
	}


}
