package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Producto;
import com.edu.sena.repository.ProductoRepository;

@Service
public class ProductoServiceimpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoR;

	@Override
	public Optional<Producto> findById(Integer id) {
		// TODO Auto-generated method stub
		return productoR.findById(id);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoR.findAll();
	}

	@Override
	public Producto save(Producto e) {
		// TODO Auto-generated method stub
		return productoR.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		productoR.deleteById(id);
	}


}
