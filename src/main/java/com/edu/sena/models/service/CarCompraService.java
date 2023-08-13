package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.CarCompra;

public interface CarCompraService {
	
	
	public Optional<CarCompra> findById(Integer id);
	public List<CarCompra> findAll();
	public CarCompra save(CarCompra e);
	public void deleteById(Integer id);

}
