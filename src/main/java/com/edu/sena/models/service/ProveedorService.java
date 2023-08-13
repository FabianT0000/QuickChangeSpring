package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Proveedor;

public interface ProveedorService {
	
	
	public Optional<Proveedor> findById(Integer id);
	public List<Proveedor> findAll();
	public Proveedor save(Proveedor e);
	public void deleteById(Integer id);

}
