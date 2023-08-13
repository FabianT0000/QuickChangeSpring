package com.edu.sena.models.service;



import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Producto;


public interface ProductoService  {
	
	public Optional<Producto> findById(Integer id);
	public List<Producto> findAll();
	public Producto save(Producto e);
	public void deleteById(Integer id);

}
