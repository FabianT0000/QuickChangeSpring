package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.ItemsCompra;
import com.edu.sena.repository.ItemCompraRepository;

@Service
public class ItemCompraServiceimpl implements ItemCompraService{
	
	
	@Autowired
	ItemCompraRepository itemcompraR;

	@Override
	public Optional<ItemsCompra> findById(Integer id) {
		// TODO Auto-generated method stub
		return itemcompraR.findById(id);
	}

	@Override
	public List<ItemsCompra> findAll() {
		// TODO Auto-generated method stub
		return itemcompraR.findAll();
	}

	@Override
	public ItemsCompra save(ItemsCompra e) {
		// TODO Auto-generated method stub
		return itemcompraR.save(e);
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		itemcompraR.deleteById(id);
	}

}
