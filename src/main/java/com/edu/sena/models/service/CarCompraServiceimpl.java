package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.CarCompra;
import com.edu.sena.repository.CarComprasRepository;

@Service
public class CarCompraServiceimpl implements CarCompraService {
	
	@Autowired
	CarComprasRepository carcompraR;

	@Override
	public Optional<CarCompra> findById(Integer id) {
		// TODO Auto-generated method stub
		return carcompraR.findById(id);
	}

	@Override
	public List<CarCompra> findAll() {
		// TODO Auto-generated method stub
		return carcompraR.findAll();
	}

	@Override
	public CarCompra save(CarCompra e) {
		// TODO Auto-generated method stub
		return carcompraR.save(e);
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		carcompraR.deleteById(id);
	}

}
