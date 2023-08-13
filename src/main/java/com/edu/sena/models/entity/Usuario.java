package com.edu.sena.models.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "usuarios")

@Table(name = "usuarios")
public class Usuario {

	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre_user")
	private String nombres;
	@Column(name = "apellidos_user")
	private String apellidos;
	@Column(name = "tipoDocu_user")
	private String tipo_documento;
	@Column(name = "nDocum_user")
	private String nDocumento;
	@Column(name = "tel_user")
	private String telefono;
	@Column(name = "pais_user")
	private String pais;
	@Column(name = "ciudad_user")
	private String ciudad;
	@Column(name = "correo_user")
	
	private String correo;
	@Column(name = "nomUsuario_user")
	private String username;
	@Column(name = "passw_user")
	private String contrasena;
	@Column(name = "direccion_user")
	private String direccion;
	@Column(name = "barrio_user")
	private String barrio;

	@OneToOne
	@JoinColumn(name = "id_perfil", unique = false)
	private Perfil perfil;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CarCompra> carcompras;


	public Usuario() {
		carcompras = new ArrayList<CarCompra>();
	}

	
	public void cliente(Usuario user) {
		user.getPerfil().toString();
			
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getnDocumento() {
		return nDocumento;
	}

	public void setnDocumento(String nDocumento) {
		this.nDocumento = nDocumento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<CarCompra> getCarcompras() {
		return carcompras;
	}

	public void setCarcompras(List<CarCompra> carcompras) {
		this.carcompras = carcompras;
	}
	public void addFactura(CarCompra carrocompra) {
		carcompras.add(carrocompra);
	}

}
