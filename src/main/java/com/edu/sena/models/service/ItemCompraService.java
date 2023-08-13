package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.ItemsCompra;

public interface ItemCompraService {
	
	public Optional<ItemsCompra> findById(Integer id);
	public List<ItemsCompra> findAll();
	public ItemsCompra save(ItemsCompra e);
	public void deleteById(Integer id);

}
