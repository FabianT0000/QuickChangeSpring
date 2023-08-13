package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Proveedor;
import com.edu.sena.repository.ProveedorRepoitory;

@Service
public class ProveedorServiceimpl implements ProveedorService {
	
	
	@Autowired
	ProveedorRepoitory proveedorR;

	@Override
	public Optional<Proveedor> findById(Integer id) {
		// TODO Auto-generated method stub
		return proveedorR.findById(id);
	}

	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return proveedorR.findAll();
	}

	@Override
	public Proveedor save(Proveedor e) {
		// TODO Auto-generated method stub
		return proveedorR.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		proveedorR.deleteById(id);
	}
	

}
